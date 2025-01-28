
import MyDynamicArray.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayIncreaseSizeTest {
    @Test
    void TestingArraySizeIncrease() {
        Array<String> array = new Array<>();
        // this is testing the fullsize of the array which would incluod the
        // indexes with nothing in them
        assertEquals(1, array.arrayFullSize());
        // this is testing the arrays size with the index's that have infromation in them
        assertEquals(0, array.size());
        array.add("ben");

        // this is testing the fullsize of the array which would incluod the
        // indexes with nothing in them
        assertEquals(1, array.arrayFullSize());
        // this is testing the arrays size with the index's that have infromation in them
        assertEquals(1, array.size());
    }

    @Test
    void testingLardArrayIncress(){

        Array<Integer> array = new Array<>();

        for(int i = 0; i < 1500; i++){
            array.add(i);
        }
        assertEquals(2048, array.arrayFullSize());
        assertEquals(1500, array.size());
    }
}