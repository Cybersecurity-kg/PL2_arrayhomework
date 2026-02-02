import java.util.*;

public class Practice09_ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(
                "Bishkek", "Osh", "Karakol"
        ));

        String[] array = cities.toArray(new String[0]);

        System.out.println("ArrayList: " + cities);
        System.out.println("Array: " + Arrays.toString(array));
    }
}
