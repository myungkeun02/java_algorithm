import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class J181927 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        answer[answer.length-1] = num_list[num_list.length - 1] > num_list[num_list.length - 2] ? num_list[num_list.length - 1] - num_list[num_list.length - 2] : num_list[num_list.length - 1] * 2;

        System.out.println(Arrays.toString(answer));


    }
}
