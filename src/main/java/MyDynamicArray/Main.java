package MyDynamicArray;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       Array<Integer> array = new Array<>();

        array.add(1);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(4);
        array.add(4);
        array.removeIteam(4);


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
        names.removeIteam("james");
        names.removeIteam("ben");
        names.removeIteam("tom");

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }




    }
}