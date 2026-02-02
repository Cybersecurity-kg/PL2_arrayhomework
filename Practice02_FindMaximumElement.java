import java.util.*;

public class Practice02_FindMaximumElement {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                "Inception", "Oppenheimer", "Odyssey", "Prestige", "Interstellar"
        ));

        String longest = "";
        for (String title : movies) {
            if (title != null && title.length() > longest.length()) {
                longest = title;
            }
        }

        System.out.println("Movies: " + movies);
        System.out.println("Longest title: \"" + longest + "\" (len=" + longest.length() + ")");
    }
}
