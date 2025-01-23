//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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



        System.out.println("they been added ");
        System.out.println("  ");
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        cars.removeALL();

        cars.add("ben");

        System.out.println(cars.get(0));

        System.out.println("numbers start now");
        Array<Integer> array = new Array<>();

        array.add(3);
        array.add(44);
        array.add(1);

        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
        System.out.println("sorted numbers");
        array.sort();
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }

        Array<Double> doubleArray = new Array<>();
        System.out.println("sorted doubles ");

        doubleArray.add(4.75);
        doubleArray.add(0.02);
        doubleArray.add(5.6);
        doubleArray.add(4.56);
        doubleArray.add(4.5);
        doubleArray.add(0.2);
        doubleArray.add(4.00);

        doubleArray.sort();
        for(int i = 0; i < doubleArray.size(); i++){
            System.out.println(doubleArray.get(i));
        }
    }
}