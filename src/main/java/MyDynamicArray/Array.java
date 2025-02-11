package MyDynamicArray;

public class Array<T> {
    private boolean sizeDecresed = false;
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
         if(count == size || count > size){
             temp = (T[]) new Object[size * 2];

             if (size() >= 0) System.arraycopy(array, 0, temp, 0, size());

             array = temp;

             size = size * 2;
         }



    }
    @SuppressWarnings("unchecked")
    private void decreasInSize(){
        T[] temp;
        // this increase the array by two times its original size



       if (count == 1){
            temp = (T[]) new Object[1];

            if (size() >= 0) System.arraycopy(array, 0, temp, 0, size());

            array = temp;

            size = 1;
       }else{
           temp = (T[]) new Object[count];

              if (size() >= 0) System.arraycopy(array, 0, temp, 0, size());
           array = temp;


          // size = size - 1;
       }
         //sizeDecresed = true;
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

    @SuppressWarnings("unchecked")
    public void  remove(int index){
            // checking if the index is in bounds of the array
            if( index < 0 || index >= size || count == 0 && size == 1){

                throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
            }

            //finding and removing the element at the inputted index
            for(int i = index; i < count - 1; i++){


                array[i] = array[i + 1];


            }


            count--;
            decreasInSize();
    }


    @SuppressWarnings("unchecked")
    public void removeItem(T input) {
        boolean  foundboolean = false;
        String temp = "";

        if(count == 0 ){
            throw new IndexOutOfBoundsException("Serach for in put does not exist" + input);
        }

        if(input instanceof String) {
             temp = ((String) input).toLowerCase();
             //input = (T) temp;
        }

        int numberOfItems = 0;
        // for finding the element with in the array
        for (int i = 0; i < count; i++) {
            T tmepArrayElement = array[i];
            if (tmepArrayElement instanceof String ){
                String Elememtemp = ((String) tmepArrayElement).toLowerCase();

                if (Elememtemp.equals(temp)) {
                    //remove(i);
                    numberOfItems++;
                    foundboolean = true;
                }
            }
            // for removing the element with in the array
            else if (array[i] == input) {
                //remove(i);
                numberOfItems++;
                foundboolean = true;
            }
        }

        // this is for if the elmement give was not found
        if(!foundboolean){
            System.err.println("Input not found: " + input);
        }
        deletItem(numberOfItems, input);


    }

    /***
     *
     *
     * @param input
     * <p> this is to split the action of the two remove Item methods up the first on make sure the items are with in the array then passes the number to this method</p>
     * <p>once all are found then it will brake the loop and return the array with out the unwonted items </p>
     */
    @SuppressWarnings("unchecked")
    private void deletItem(int numberOfItems , T input ){
        int j = 0;
        compareTo<T> compareTo = new compareTo<>();
        T[] arrayTemp = (T[]) new Object[count];


        for (int i = 0; i < count ; i++) {

            if ( compareTo.compareToo(array[i] , input) != 0) {
                arrayTemp[j] = array[i];

                j++;
            }
        }


        count = count - numberOfItems;
        array = arrayTemp;
        decreasInSize();
    }



    @SuppressWarnings("unchecked")
    public void removeALL(){

        if(count == 0){
            throw new IndexOutOfBoundsException("there is nothing to remove ");
        }
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

        // checking the size and count to see if size needs to be increased
        if(count == size || count > size) increaseSize();
        // updating the count
        count++;
        // then value being moved is added to the end of the array
        array[count - 1] = temp;

    }

    public int indexOf(T value){
        compareTo<T> compareTo = new compareTo<>();
       int low = 0 , high = count - 1;
       while(low <= high){
           int mid = low + (high - low) / 2;
           if (compareTo.compareToo(array[mid] , value) == 0)
               return mid;


           // If x greater, ignore left half
           if (compareTo.compareToo(array[mid] , value) < 0)
               low = mid + 1;

               // If x is smaller, ignore right half
           else
               high = mid - 1;
       }

       return -1;
    }

    public Boolean isEmpty(){

        if(count > 0) return false;


        return true;
    }

    public T[] addAll(Array<T> addArray){

        if(count == size) increaseSize();
        else{
            for(int i = 0; i < addArray.size(); i++ ){

                if(count == size)increaseSize();
                else{
                    array[ count] =  addArray.get(i);
                    count++;

                }

            }
        }

        return array;
    }

    public void set(T value , int index){

        // then replaced with the chosen input at the given index
        array[index] = value;
    }

    public void ensureCapacity(int capacity){
        T[] temp;
        if(size < capacity){
            size = size + (capacity - size);
            temp = (T[]) new Object[size];

            if (size() >= 0) System.arraycopy(array, 0, temp, 0, size());

            array = temp;
        }


    }
}
