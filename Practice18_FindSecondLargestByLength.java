import java.util.*;

public class Practice18_FindSecondLargestByLength {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                "Inception", "Oppenheimer", "Odyssey", "Prestige", "Interstellar"
        ));
        movies.sort((a, b) -> Integer.compare(b.length(), a.length()));

        String first = null;
        String second = null;
        for (String title : movies) {
            if (first == null) {
                first = title;
            } else if (title.length() < first.length()) {
                second = title;
                break;
            }
        }

        System.out.println("Sorted by length (desc): " + movies);
        System.out.println("Longest: " + first + " (len=" + first.length() + ")");
        if (second != null) {
            System.out.println("Second longest (by length): " + second + " (len=" + second.length() + ")");
        } else {
            System.out.println("Second longest not found (need at least 2 different lengths).");
        }
    }
}
