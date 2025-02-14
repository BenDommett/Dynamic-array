import MyDynamicArray.Array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ensureCapacityTest {

    @Test
    void ensureCapacityEmptyArray(){
        Array<String> names = new Array<>();


        names.ensureCapacity(4);
        // within this test I am using the arrayFullSize as this is the size of the null indexs of the array
        assertEquals(4 , names.arrayFullSize());
    }

    @Test
    void enureCapacityInArrayWithEliments(){
        Array<String> names = new Array<>();

         names.add("ben");
        names.add("emma");
        names.add("james");
        names.add("paul");
        names.ensureCapacity(6);

        assertEquals(6 , names.arrayFullSize());
    }

    @Test
    void ensureCapcityCanAllowAdds(){
        Array<String> names = new Array<>();

        names.add("ben");
        names.add("emma");
        names.add("james");
        names.add("paul");
        names.ensureCapacity(6);
        names.add("holly");
        names.add("david");

        assertEquals(6 , names.arrayFullSize());
    }


}
