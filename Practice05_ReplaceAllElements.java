import java.util.*;

public class Practice05_ReplaceAllElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(
                "Red", "Green", "Blue", "White"
        ));

        Collections.fill(colors, "Black");

        System.out.println("Colors after replace: " + colors);
    }
}
