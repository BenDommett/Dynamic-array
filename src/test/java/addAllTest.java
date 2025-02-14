import MyDynamicArray.Array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class addAllTest {


    @Test
    void AddallToEmptyArray(){
        Array<Integer> nums = new Array<>();

        Array<Integer> numsTest =new Array<>();

        for(int i = 0; i < 20; i++){
            numsTest.add(i + 1);

        }

        nums.addAll(numsTest);

        for(int x = 0; x < nums.size(); x++){

            assertEquals(numsTest.get(x) , nums.get(x) );
        }
    }

    @Test
    void addAllToUsedArray(){
        Array<String> names = new Array<>();

        names.add("ben");
        names.add("james");
        names.add("paul");

        Array<String> namesTest = new Array<>();

        namesTest.add("david");
        namesTest.add("sophie");
        namesTest.add("emma");
        namesTest.add("ryan");
        namesTest.add("amanda");

        names.addAll(namesTest);

        String[] test = {"ben" , "james" , "paul" , "david" , "sophie" , "emma" , "ryan" , "amanda"};

        for(int i = 0; i < names.size(); i++){

            assertEquals(test[i] , names.get(i));

        }
    }
}
