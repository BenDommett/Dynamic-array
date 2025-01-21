public class Array<T> {

    private T[] array;
    private int size;
    private int count;

    @SuppressWarnings("unchecked")
    public  Array(){
        // this is the class constructor
        this.array = (T[]) new Object[1];

        //array = new int[1];
        size = 1;
        count = 0;
    }

    // this allows any type to be added to the array
    public void add(T data){
        if(count == size) increaseSize();

        array[count]  = data;
        count++;

    }

    @SuppressWarnings("unchecked")
    private void increaseSize(){
        T[] temp;
        // this increase the array by two times its original size
         if(count == size){
             temp = (T[]) new Object[size * 2];

             if (size() >= 0) System.arraycopy(array, 0, temp, 0, size());

             array = temp;

             size = size * 2;
         }



    }
    public int size(){
        // this is the used parts of the array
        return count;
    }

    public int arrayFullSize(){
        // this returns the full size of the array even the unused parts of the array
        return size;
    }

    public T get(int index){
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        return array[index];


    }

    public void  remove(int index){
            // checking if the index is in bounds of the array
            if( index < 0 || index >= size){
                System.out.println("Out of bounds");

            }

            //finding and removing the element at the inputted index
            for(int i = index; i < count; i++){
                array[i] = array[i + 1];
            }

            count--;





    }



    public void remove(T input) {
       // for finding the element with in the array
        for (int i = 0; i < count; i++) {
            // for removing the element with in the array
            if (array[i] == input) {
                remove(i);
            }
        }
    }
    @SuppressWarnings("unchecked")
    public void removeALL(){


        // this creates a new array
        array = (T[]) new Object[1];
        // resets the values to the original state
        count = 0;
        size = 1;
    }

    // for ease in the creating of my own array i am adding with compareto method and sort method to the array class
    // i undearstand they are in to diffrent class repectivly

    private int compareTo(String val1 , String  val2){
        // to stop any comparison issues with the letters being compared as all lower case letters come first
        val1 = val1.toLowerCase();
        val2 = val2.toLowerCase();

        // getting the lengths of the words and then the min length for the loop
        int leng1 = val1.length();
        int leng2 = val2.length();
        int minLeng = Math.min(leng1 , leng2);

        // loop for comparison of the letters within the two words
        for(int i = 0; i < minLeng; i++){
            char char1 = val1.charAt(i);
            char char2 = val2.charAt(i);

            if(char1 != char2){

                if(char1 > char2 ){
                    // this means the letter comes before the other
                    return 1;
                }else {
                    // means it comes after
                    return -1;
                }
            }

        }
        // this is if the words are the same as one another
        return 0;

    }


    public T[] sort(){

        int index = count;

        for(int i = 0; i < index - 1; i++){
            int minIndex = i;
            for(int x = i + 1; x < index; x++  ){
                // this is calling the compareTO i made with in this class not the pre-existing one
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
        // this is where the value is copy from the array
        temp = array[index];
        // then replaced with the chosen input at the given index
        array[index] = input;
        // updating the count
        count++;
        // checking the size and count to see if size needs to be increased
        if(count == size) increaseSize();
        // then value being moved is added to the end of the array
        array[count - 1] = temp;


    }
}
