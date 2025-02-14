import MyDynamicArray.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class setTest {
    @Test
    void  setInemptyArrayOutOfbounds(){
        Array<Integer> num = new Array<>();

        assertThrows(IndexOutOfBoundsException.class , () -> num.set(2 , 1));
    }
    @Test
    void setInemptyArrayInBound(){
        Array<Integer> num = new Array<>();

        num.set(32 , 0);

        assertEquals(32 , num.get(0));
    }

    @Test
    void SetOutOfboundsOfarray(){
        Array<Integer> num = new Array<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);



        assertThrows(IndexOutOfBoundsException.class, () -> num.set(30 , 30));
    }

    @Test
    void setArrayInteger(){
        Array<Integer> num = new Array<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        num.set(30 , 1);

        int[] test = {1 , 30 , 3 ,4};

        for(int x = 0; x < test.length; x++){

            assertEquals(test[x] , num.get(x));
        }
    }

    @Test
    void setArrayString(){
        Array<String> names = new Array<>();

        names.add("ben");
        names.add("james");
        names.add("tom");

        names.set("emma" , 3);


        String[] test = {"ben", "james" , "tom" , "emma" };

        for(int i = 0; i < test.length; i++){
            assertEquals(test[i] , names.get(i));

        }
    }

    @Test
    void setArrayDouble(){

        Array<Double> money = new Array<>();

        money.add(0.2);
        money.add(3.5);
        money.add(4.5);
        money.add(5.6);

        money.set(3.6 , 2);

        Double[] test = {0.2 , 3.5 , 3.6 , 5.6};

        for(int i = 0; i < test.length; i++){

            assertEquals(test[i] , money.get(i));

        }
    }

}
