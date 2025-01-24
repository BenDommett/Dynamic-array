

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
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
        cars.sort();
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }


    }
}