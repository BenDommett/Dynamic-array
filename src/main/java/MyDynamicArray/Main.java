package MyDynamicArray;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       Array<Integer> array = new Array<>();
        // this is still an issues with the numbers removing all the elements from the array where the string seem to be fine th

        array.add(1);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(4);
        array.add(4);



        array.removeItem(4);


        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }


        Array<String> names  = new Array<>();

        names.add("ben");
        names.add("Emma");
        names.add("james");
        names.add("ryan");
        names.add("danny");
        names.add("tom");
        names.add("tom");

        names.removeItem("james");
        names.removeItem("ben");
        names.removeItem("tom");

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }




    }

}