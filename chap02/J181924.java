import java.util.Arrays;

public class J181924 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

        int[] answer = arr.clone();

        for (int[] query : queries) {
            int i = answer[query[0]];
            int j = answer[query[1]];
            answer[query[0]] = j;
            answer[query[1]] = i;
        }
        System.out.println(Arrays.toString(answer));
    }
}
