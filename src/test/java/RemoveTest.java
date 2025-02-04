import MyDynamicArray.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveTest {
    @Test
    void removeNegative(){
        Array<String> array = new Array<>();

        array.remove(0);

        assertEquals(0 , array.size());
    }

    @Test
    void removeOutOfboundsNegative(){
        Array<String> array = new Array<>();



        assertThrows(IndexOutOfBoundsException.class, () ->  array.remove(-6) );

    }

    @Test
    void removeOutOfboundsPosative(){
        Array<String> array = new Array<>();



        assertThrows(IndexOutOfBoundsException.class, () ->  array.remove(6) );

    }

    @Test
    void outOfboundsDoubleRemove(){
        Array<String> array = new Array<>();
        array.add("hello");
        array.add("ben");

        array.remove(0);
        array.remove(0);
        assertThrows(IndexOutOfBoundsException.class, () -> array.remove(0));


    }



}
