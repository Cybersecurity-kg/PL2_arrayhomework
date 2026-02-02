import java.util.*;

public class Practice11_FindCommonElements {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(Arrays.asList(
                "Kyrgyzstan", "USA", "Uzbekistan", "Tajikistan", "Kazakhstan"
        ));
        ArrayList<String> b = new ArrayList<>(Arrays.asList(
                "Uzbekistan", "Turkmenistan", "Kyrgyzstan"
        ));

        HashSet<String> setA = new HashSet<>(a);
        ArrayList<String> common = new ArrayList<>();
        for (String c : b) {
            if (setA.contains(c)) {
                common.add(c);
            }
        }

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("Common: " + common);
    }
}
