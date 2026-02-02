import java.util.*;

public class Practice17_RemoveNullValues {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList(
                "Ahmet", null, "Adelya", null, "Amina"
        ));

        students.removeIf(Objects::isNull);

        System.out.println("Students without nulls: " + students);
    }
}
