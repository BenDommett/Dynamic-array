import MyDynamicArray.Array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class isEmptyTest {

    @Test
    void isEmptyTestFalse(){
        Array<String> names = new Array<>();

        names.add("ben");
        names.add("emma");
        names.add("Jame");

        assertFalse(names.isEmpty());
    }

    @Test
    void isEmptyTestTrue(){

        Array<Integer> PhoneNumber = new Array<>();

        assertTrue(PhoneNumber.isEmpty());

    }
}
