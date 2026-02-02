import java.util.*;

public class Practice03_CountOccurrences {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>(Arrays.asList(
                "Burger", "Shaurma", "Pizza", "Pepsi", "Pizza"
        ));

        int count = 0;
        for (String food : foods) {
            if ("Pizza".equals(food)) {
                count++;
            }
        }

        System.out.println("Foods: " + foods);
        System.out.println("Pizza count: " + count);
    }
}
