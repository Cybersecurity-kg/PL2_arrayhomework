import java.util.*;

public class Practice01_MergeUniqueElements {
    public static void main(String[] args) {
        ArrayList<String> books1 = new ArrayList<>(Arrays.asList(
                "1984", "Dune", "The Hobbit", "Dune"
        ));
        ArrayList<String> books2 = new ArrayList<>(Arrays.asList(
                "Dune", "Harry Potter", "The Hobbit", "Odyssey"
        ));

        LinkedHashSet<String> merged = new LinkedHashSet<>();
        merged.addAll(books1);
        merged.addAll(books2);

        ArrayList<String> result = new ArrayList<>(merged);
        System.out.println("Books 1: " + books1);
        System.out.println("Books 2: " + books2);
        System.out.println("Merged unique: " + result);
    }
}
