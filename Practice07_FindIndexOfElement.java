import java.util.*;

public class Practice07_FindIndexOfElement {
    public static void main(String[] args) {
        ArrayList<String> flowers = new ArrayList<>(Arrays.asList(
                "Roza", "Navoza", "Romashka", "Tulip", "Lavender", "Roza"
        ));

        int first = flowers.indexOf("Roza");
        int last = flowers.lastIndexOf("Roza");

        System.out.println("Flowers: " + flowers);
        System.out.println("First index of Roza: " + first);
        System.out.println("Last index of Roza: " + last);
    }
}
