import java.util.Arrays;
import java.util.stream.IntStream;

public class J181928 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};

        StringBuilder br1 = new StringBuilder();
        StringBuilder br2 = new StringBuilder();

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                br1.append(num_list[i]);
            } else {
                br2.append(num_list[i]);
            }
        }
        System.out.println(Integer.parseInt(br1.toString()) + Integer.parseInt(br2.toString()));
    }
}
