import MyDynamicArray.Array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class indexOfTest {

    @Test
    void outOfNotFound(){



       Array<String> names = new Array<>();



       names.add("james");
       names.add("paul");



        // -1 indecates its not been found there for will coures issues
       assertEquals(-1 ,  names.indexOf("ben"));
    }

    @Test
    void outOfFoundString(){

        Array<String> names = new Array<>();



        names.add("james");
        names.add("paul");

        assertEquals(1 , names.indexOf("paul"));
    }

}
