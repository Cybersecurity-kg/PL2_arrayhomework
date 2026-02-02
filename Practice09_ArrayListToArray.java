import java.util.*;

public class Practice09_ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(
                "Bishkek", "Balykchy", "Karakol"
        ));

        String[] arr = cities.toArray(new String[0]);

        System.out.println("Cities list: " + cities);
        System.out.println("Cities array: " + Arrays.toString(arr));
    }
}
