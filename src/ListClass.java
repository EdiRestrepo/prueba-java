import java.util.ArrayList;

public class ListClass {
    public static void main(String[] args) {
        ArrayList arry = new ArrayList(8);

        arry.add(44);
        arry.add(65);
        arry.add(33);
        arry.add(42);
        arry.add(13);
        arry.add(31);
        arry.add(44);
        arry.add(51);

        int element = arry.lastIndexOf(44);
        System.out.println("Index: " + element);

    }
}
