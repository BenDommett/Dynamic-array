//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Array<String> cars = new Array<>();


        cars.add("bmw");
        cars.add("volvo");
        cars.add("Aston Martin");
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        cars.Insert("Land Rover" , 1);
        cars.Insert("Lotus" , 0);

        System.out.println("they been added ");
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        cars.removeALL();

        cars.add("ben");

        System.out.println(cars.get(0));
    }
}