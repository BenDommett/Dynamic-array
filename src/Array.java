public class Array<T> {

    private T[] array;
    private int size;
    private int count;

    @SuppressWarnings("unchecked")
    public  Array(){
        this.array = (T[]) new Object[1];

        //array = new int[1];
        size = 1;
        count = 0;
    }

    public void add(T data){
        if(count == size) increaseSize();

        array[count]  = data;
        count++;

    }
    @SuppressWarnings("unchecked")
    private void increaseSize(){
        T[] temp;

         if(count == size){
             temp = (T[]) new Object[size * 2];

             if (size() >= 0) System.arraycopy(array, 0, temp, 0, size());

             array = temp;

             size = size * 2;
         }



    }
    public int size(){
        return count;
    }

    public int arrayFullSize(){
        return size;
    }
    public T get(int index){
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        return array[index];


    }

    public void  remove(int index){

            if( index < 0 || index >= size){
                System.out.println("Out of bounds");

            }

            for(int i = index; i < count; i++){
                array[i] = array[i + 1];
            }

            count--;





    }



    public void remove(T input) {
        for (int i = 0; i < count; i++) {

            if (array[i] == input) {
                remove(i);
            }
        }
    }
    @SuppressWarnings("unchecked")
    public void removeALL(){
        T[] EmptyeArray =  (T[]) new Object[1];


        array = EmptyeArray;
        count = 0;
        size = 1;
    }

    // for ease in the creating of my own array i am adding with compareto method and sort method to the array class
    // i undearstand they are in to diffrent class repectivly

    private int compareTo(String val1 , String  val2){
        val1 = val1.toLowerCase();
        val2 = val2.toLowerCase();


        int leng1 = val1.length();
        int leng2 = val2.length();
        int minLenght = Math.min(leng1 , leng2);

        for(int i = 0; i < minLenght; i++){
            char char1 = val1.charAt(i);
            char char2 = val2.charAt(i);

            if(char1 != char2){

                if(char1 > char2 ){
                    return 1;
                }else {
                    return -1;
                }
            }

        }
        if(leng1 == leng2){
            return 0;
        }else if (leng1 > leng2){
            return 1;
        }else{
            return 1;
        }

    }


    public T[] sort(){

        int index = count;

        for(int i = 0; i < index - 1; i++){
            int minIndex = i;
            for(int x = i + 1; x < index; x++  ){

                if(compareTo((String) array[x], (String) array[minIndex]) < 0){
                    minIndex = x;
                }
            }
            if(minIndex != i){

                T temp =  array[i];
                array[i] = array[minIndex];
                array[minIndex]  = temp;
            }
        }

        return array;

    }

    public  void Insert(T input , int index ){


        T temp;
        temp = array[index];
        array[index] = input;
        count++;
        if(count == size) increaseSize();
        array[count - 1] = temp;

    }
}
