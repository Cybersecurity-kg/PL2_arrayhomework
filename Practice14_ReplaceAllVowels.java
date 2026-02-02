import java.util.*;

public class Practice14_ReplaceAllVowels {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "hello", "world", "java", "python"
        ));

        ArrayList<String> result = new ArrayList<>();
        for (String w : words) {
            if (w == null) {
                result.add(null);
            } else {
                result.add(w.replaceAll("[AEIOUaeiou]", "*"));
            }
        }

        System.out.println("Original: " + words);
        System.out.println("Vowels replaced: " + result);
    }
}
