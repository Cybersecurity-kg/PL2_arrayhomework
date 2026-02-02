import java.util.*;

public class Practice10_ArrayToArrayList {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1};

        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("ArrayList: " + list);
    }
}
