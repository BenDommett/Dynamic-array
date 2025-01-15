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



    public void remove(T input){
        for(int i = 0; i < count; i++){

            if(array[i] == input){
                remove(i);
            }
        }
    }

}
