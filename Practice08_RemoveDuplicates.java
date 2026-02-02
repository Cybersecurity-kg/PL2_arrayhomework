import java.util.*;

public class Practice08_RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(Arrays.asList(
                "Cat", "Dog", "Cat", "Horse", "Dog", "Bird"
        ));

        LinkedHashSet<String> set = new LinkedHashSet<>(animals);
        ArrayList<String> unique = new ArrayList<>(set);

        System.out.println("Original: " + animals);
        System.out.println("Without duplicates: " + unique);
    }
}
