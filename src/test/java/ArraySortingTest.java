import MyDynamicArray.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraySortingTest {
    @Test
    void integerSorttest(){
        Array<Integer> arrayNum = new Array<>();
        arrayNum.ensureCapacity(5);
        arrayNum.add(4);
        arrayNum.add(67);
        arrayNum.add(3);
        arrayNum.add(50);
        arrayNum.add(28);


        Integer[] nums = {3, 4 , 28 , 50 , 67};

       assertArrayEquals(nums , arrayNum.sort());

    }


    @Test
    void StringSortTest(){
        Array<String> names = new Array<>();
        names.ensureCapacity(7);
        names.add("James");
        names.add("Ben");
        names.add("Emma");
        names.add("David");
        names.add("Paul");
        names.add("Dan");
        names.add("Danny");


        String[] namesSorted = {"Ben" , "Dan" ,"Danny", "David"  , "Emma" ,"James" , "Paul"};

        assertArrayEquals(namesSorted , names.sort());

    }

    @Test
    void DoubleSortTest(){
        Array<Double> money = new Array<>();
        money.ensureCapacity(8);
        money.add(0.35);
        money.add(20.35);
        money.add(2.09);
        money.add(12.5);
        money.add(0.05);
        money.add(3.5);
        money.add(5.80);
        money.add(1.78);

        Double[] soortedMoney = {0.05, 0.35 ,1.78,2.09,3.5, 5.80,12.5,20.35};

        assertArrayEquals(soortedMoney , money.sort());

    }

    @Test
    void emptyArraySortTest(){
        Array<String> noNames = new Array<>();

        String[] testNoNames = new String[1];

       assertArrayEquals(testNoNames , noNames.sort());
    }



}

