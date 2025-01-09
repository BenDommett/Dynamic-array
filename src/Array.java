public class Array {
    private int[] array;
    private int size;
    private int count;
    public  Array(){
        array = new int[1];
        size = 1;
        count = 0;
    }
    public void add(int data){
        if(count == size) increaseSize();

        array[count] = data;
        count++;

    }

    private void increaseSize(){
         int[] temp;

         if(count == size){
             temp = new int[size * 2];

             if (getSize() >= 0) System.arraycopy(array, 0, temp, 0, getSize());

             array = temp;

             size = size * 2;
         }



    }
    public int getSize(){
        return count;
    }
    public int get(int index){

        return array[index];
    }
}
