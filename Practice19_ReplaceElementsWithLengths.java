import java.util.*;

public class Practice19_ReplaceElementsWithLengths {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Apple", "Banana", "Kiwi"
        ));

        ArrayList<Integer> lengths = new ArrayList<>();
        for (String f : fruits) {
            lengths.add(f == null ? 0 : f.length());
        }

        System.out.println("Fruits: " + fruits);
        System.out.println("Lengths: " + lengths);
    }
}
