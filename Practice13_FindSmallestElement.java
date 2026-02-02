import java.util.*;

public class Practice13_FindSmallestElement {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>(Arrays.asList(
                "Loser", "the less i know the better", "Let It Happen", "New person same old misstakes", "Borderline"
        ));

        String shortest = null;
        for (String s : songs) {
            if (s == null) continue;
            if (shortest == null || s.length() < shortest.length()) {
                shortest = s;
            }
        }

        System.out.println("Songs: " + songs);
        System.out.println("Shortest song: \"" + shortest + "\" (len=" + shortest.length() + ")");
    }
}
