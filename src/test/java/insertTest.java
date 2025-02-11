import MyDynamicArray.Array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class insertTest {
    @Test
    void frontInsertTest(){
        Array<String> places = new Array<>();

        places.add("America");
        places.add("Japan");
        places.add("England");
        places.add("Wales");

        places.Insert("Scotland", 0);

        String[] test = {"Scotland"  , "Japan", "England" , "Wales" , "America"};

        for(int i = 0; i < test.length; i++){
            String testTemp = test[i];

            String placesTemp = places.get(i);

            assertEquals(testTemp , placesTemp );
        }
    }
}
