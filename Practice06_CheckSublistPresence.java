import java.util.*;

public class Practice06_CheckSublistPresence {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<>(Arrays.asList(
                "Formula1", "WRC", "LeMann", "gt3"
        ));
        ArrayList<String> small = new ArrayList<>(Arrays.asList(
                "gt3", "WRC"
        ));

        boolean containsAll = sports.containsAll(small);

        System.out.println("Sports: " + sports);
        System.out.println("Sublist: " + small);
        System.out.println("Contains sublist: " + containsAll);
    }
}
