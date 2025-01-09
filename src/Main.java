//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        for(int i = 0; i < 10; i++){
            array.add(i + 1);
        }

        for(int i = 0; i < array.getSize(); i++){
            System.out.println(array.get(i));
        }
    }
}