import java.util.HashSet;
import java.util.Set;

public class J1845 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};

        Set<Integer> unique = new HashSet<>();

        for (int num : nums) {
            unique.add(num);
        }

        System.out.println(Math.min(unique.size(), nums.length / 2));

    }
}
