import java.util.*;

public class Practice12_RemoveEvenLengthStrings {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Ahmet", "Adelya", "Arlen", "Talant", "Beka", "China"
        ));

        names.removeIf(s -> s != null && s.length() % 2 == 0);

        System.out.println("After removing even-length strings: " + names);
    }
}
