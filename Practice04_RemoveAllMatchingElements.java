import java.util.*;

public class Practice04_RemoveAllMatchingElements {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Banan", "Banan", "Orange", "Mango", "Kiwi"
        ));

        fruits.removeIf(f -> "Banan".equals(f));

        System.out.println("After removing Banana: " + fruits);
    }
}
