import java.util.*;

public class Practice15_PartitionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                10, 7, 15, 1, -7, 2, 0
        ));

        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int x : numbers) {
            if (x % 2 == 0) evens.add(x);
            else odds.add(x);
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Evens  : " + evens);
        System.out.println("Odds   : " + odds);
    }
}
