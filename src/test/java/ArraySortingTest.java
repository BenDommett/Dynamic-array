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
}

