package MyDynamicArray;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Array<String> array = new Array<>();
        array.add("hello");
        array.add("ben");

        array.remove(0);

        Array<String> cars = new Array<>();

        cars.add("bmw");
        cars.add("volvo");
        cars.add("Aston Martin");
        cars.add("Land Rover");
        cars.add("Lotus" );
        cars.sort();
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        System.out.println(cars.indexOf("volvo"));

        System.out.println(cars.isEmpty());

        Array<String> cars2 = new Array<>();
        cars2.add("Volkswagen");
        cars2.add("Toyota");
        cars2.add("mercedes");

        cars.addAll(cars2);
        System.out.println(cars2.isEmpty());

        System.out.println("after add all");
        System.out.println("  ");
        cars.set("ford" , 3);
        cars.sort();
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        cars.ensureCapacity(20);


        cars.add("ben1");
        cars.add("ben2");
        cars.add("ben3");
        cars.add("ben4");
        cars.add("ben5");
        cars.add("ben6");
        cars.add("ben7");
        cars.add("ben8");
        cars.add("ben9");
        cars.add("ben10");
        cars.add("ben11");
        cars.add("ben12");
        cars.add("ben13");
        cars.add("ben14");
        cars.add("ben15");
        cars.add("ben16");


        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }




    }
}