import java.util.*;

public class Practice15_PartitionEvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                10, 7, 15, 1, -7, 8, 0
        ));

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (Integer n : numbers) {
            if (n == null) continue;
            if (n % 2 == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
