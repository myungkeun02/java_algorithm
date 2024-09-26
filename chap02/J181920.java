import java.util.Arrays;

public class J181920 {
    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;

        int[] answer = new int[end_num - start_num + 1];

        for (int i = start_num; i <= end_num; i++) {
            answer[i - start_num] = i;
        }
        System.out.println(Arrays.toString(answer));
    }
}
