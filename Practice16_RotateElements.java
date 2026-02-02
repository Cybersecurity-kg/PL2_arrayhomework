import java.util.*;

public class Practice16_RotateElements {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"
        ));

        Collections.rotate(days, 2);

        System.out.println("Rotated days: " + days);
    }
}
