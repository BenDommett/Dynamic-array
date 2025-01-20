//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>();

        for(int i = 0; i < 10; i++){
            array.add(i + 1);
        }
        Array<String> words  = new Array<>();

        words.add("Ben");
        words.add("Emma");
        words.add("James");
        words.add("David");
        words.add("Adam");
        words.add("Seth");
        words.add("Paul");
        words.sort();
        for(int x = 0; x < words.size(); x++ ){
            System.out.println(words.get(x));
        }

        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }


        words.removeALL();

        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }

        System.out.println("after Emma removed ");
        for(int x = 0; x < words.size(); x++ ){
            System.out.println(words.get(x));
        }


    }
}