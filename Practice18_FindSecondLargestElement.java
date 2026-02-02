import java.util.*;

public class Practice18_FindSecondLargestElement {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                "Inception", "Oppenheimer", "Odyssey", "Prestige", "Interstellar"
        ));

        LinkedHashSet<String> unique = new LinkedHashSet<>(movies);
        ArrayList<String> uniqueList = new ArrayList<>(unique);

        uniqueList.sort((a, b) -> Integer.compare(b.length(), a.length()));

        if (uniqueList.size() < 2) {
            System.out.println("Not enough unique titles to find 2nd largest.");
            System.out.println("Titles: " + uniqueList);
            return;
        }

        String second = uniqueList.get(1);
        System.out.println("Movies (original): " + movies);
        System.out.println("Unique sorted by length desc: " + uniqueList);
        System.out.println("Second longest: \"" + second + "\" (len=" + second.length() + ")");
    }
}
