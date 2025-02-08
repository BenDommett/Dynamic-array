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
        names.add("tom");
        names.removeIteam("james");
        names.removeIteam("ben");


        Array<String> test = new Array<>();
        test.ensureCapacity(3);
        test.add("Emma");
        test.add( "ryan" );
        test.add("danny");
        boolean sameSize = false;
        if(names.size() == test.size()){
            sameSize = true;
            for(int i = 0; i < test.size(); i++){
                String temp = names.get(i);
                String tempTest = test.get(i);
                assertEquals(tempTest , temp);

            }
            assertTrue(sameSize);
        }




    }

    @Test
    void removeOutOfBounds(){
        Array<String> names  = new Array<>();

        assertThrows(IndexOutOfBoundsException.class ,() -> names.removeIteam("Ben"));
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

        names.removeIteam(ben);

        String expectedMessage = "Input not found: " + ben + System.lineSeparator();

        assertEquals(expectedMessage , errContent.toString()  );

    }

    @Test
    void removeInteger(){
        Array<Integer> array = new Array<>();

        array.add(1);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(4);
        array.add(4);

        array.removeIteam(4);


    }
}
