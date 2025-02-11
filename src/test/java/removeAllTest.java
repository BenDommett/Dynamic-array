import MyDynamicArray.Array;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;

public class removeAllTest {

    @Test
    void removeAllString(){
        Array<String> names = new Array<>();
        names.add("paul");
        names.add("katie");
        names.add("ryan");
        names.add("yas");

        names.removeALL();



        assertEquals(0, names.size());
    }

    @Test
    void removeAllInteger(){
        Array<Integer> num = new Array<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        num.removeALL();

        assertEquals(0 , num.size());


    }

    @Test
    void removeAllDoubles(){
        Array<Double> Dnum = new Array<>();

        Dnum.add(1.2);
        Dnum.add(3.4);
        Dnum.add(4.5);
        Dnum.add(6.7);


        Dnum.removeALL();

        assertEquals(0 , Dnum.size());
    }

    @Test
    void removeAllThrow(){
        Array<String> array = new Array<>();

        assertThrows(IndexOutOfBoundsException.class , () -> array.removeALL());
    }
}
