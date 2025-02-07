import MyDynamicArray.Array;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


/**
 * <p> this is diffrent test to the other Remove as that was looking at the index vertion of the method this is looking at the method that finds an element and deletes that one form the array. </p>
 *
 */
public class RemoveElement {

    @Test
    void removeElement(){
        Array<String> names  = new Array<>();

        names.add("ben");
        names.add("Emma");
        names.add("james");
        names.add("ryan");
        names.add("danny");
        names.remove("james");
        String[] test = {"Emma" , "ryan" ,"danny"};

        names.arrayFullSize();
        assertArrayEquals(test ,  names.remove("ben"));
    }

    @Test
    void removeOutOfBounds(){
        Array<String> names  = new Array<>();

        assertThrows(IndexOutOfBoundsException.class ,() -> names.remove("Ben"));
    }

    @Test
    void elementNotFound(){

        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        PrintStream originalErr = System.err;
        Array<String> names  = new Array<>();

        String ben = "ben";
        names.add("Emma");
        names.add("james");
        names.add("ryan");
        names.add("danny");


        System.setErr(new PrintStream(errContent));

        names.remove(ben);

        String expectedMessage = "Input not found: " + ben + System.lineSeparator();

        assertEquals(expectedMessage , errContent.toString()  );

    }
}
