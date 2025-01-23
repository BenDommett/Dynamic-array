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


    // selection sort - will possibly change in the future
    public T[] sort(){
        compareTo<T> compareTo = new compareTo<>();
        int index = count;

        for(int i = 0; i < index - 1; i++){
            int minIndex = i;
            for(int x = i + 1; x < index; x++  ){
                // this is calling the compareTO i made with in this class not the pre-existing one
                if(compareTo.compareToo( array[x], array[minIndex]) < 0){
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
