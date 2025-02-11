import MyDynamicArray.Array;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


/**
 * <p> this is diffrent test to the other Remove as that was looking at the index vertion of the method this is looking at the method that finds an element and deletes that one form the array. </p>
 *
 */
public class removeElementTest {

    @Test
    void removeElements(){
        Array<String> names  = new Array<>();

        names.add("ben");
        names.add("Emma");
        names.add("james");
        names.add("ryan");
        names.add("danny");
        names.add("tom");
        names.removeItem("james");
        names.removeItem("ben");


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

        assertThrows(IndexOutOfBoundsException.class ,() -> names.removeItem("Ben"));
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

        names.removeItem(ben);

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

        Array<Integer> test = new Array<>();
        test.add(1);
        test.add(5);
        test.add(6);

        array.removeItem(4);
        boolean sameSize = false;
        if(array.size() == array.size()){
            sameSize = true;
            for(int i = 0; i < array.size(); i++){
                int temp = array.get(i);
                int tempTest = test.get(i);
                assertEquals(tempTest , temp);

            }
            assertTrue(sameSize);
        }

    }


    @Test
    void elementRomoveWithTwoOnEnd(){
        Array<Integer> array = new Array<>();

        array.add(1);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(4);
        array.add(4);
        array.add(10);
        array.add(10);
        Array<Integer> test = new Array<>();
        test.add(1);
        test.add(5);
        test.add(6);
        test.add(10);
        test.add(10);
        array.removeItem(4);
        boolean sameSize = false;
        if(array.size() == array.size()){
            sameSize = true;
            for(int i = 0; i < array.size(); i++){
                int temp = array.get(i);
                int tempTest = test.get(i);
                assertEquals(tempTest , temp);

            }
            assertTrue(sameSize);
        }
    }
    @Test
    void removeFromEmptyArray(){

        Array<String> array = new Array<>();

        assertThrows(IndexOutOfBoundsException.class , () -> array.removeItem("Ben"));
    }

    @Test
    void RemoveAllEments(){

        Array<String> Names = new Array<>();
        Names.add("james");
        Names.add("Ben");

        Names.removeItem("ben");
        Names.removeItem("james");

        assertThrows(IndexOutOfBoundsException.class , () -> Names.removeItem("emma"));
    }

    @Test
    void removingFromFrontOfArray(){
        Array<String> names = new Array<>();

        names.add("ben");
        names.add("ben");
        names.add("james");
        names.add("paul");
        names.add("emma");
        names.add("Ben");
        names.removeItem("ben");
        String[] test = {"james" , "paul" , "emma" };

        for(int i = 0; i < test.length; i++){
            String TestTemp = test[i];

            String namesTemp = names.get(i);

            assertEquals(TestTemp , namesTemp);
        }

    }
    @Test
    void removingFromTheBackOfArray(){
        Array<String> names = new Array<>();


        names.add("james");
        names.add("paul");
        names.add("Ben");
        names.add("emma");
        names.add("ben");
        names.add("ben");
        names.removeItem("ben");
        String[] test = {"james" , "paul" , "emma" };

        for(int i = 0; i < test.length; i++){
            String TestTemp = test[i];

            String namesTemp = names.get(i);

            assertEquals(TestTemp , namesTemp);
        }

    }

}





