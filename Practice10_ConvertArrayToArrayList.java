import java.util.*;

public class Practice10_ConvertArrayToArrayList {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 9, 2};

        ArrayList<Integer> list = new ArrayList<>();
        for (int n : numbers) {
            list.add(n);
        }

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("ArrayList: " + list);
    }
}
