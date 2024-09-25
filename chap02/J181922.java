import java.util.Arrays;

public class J181922 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        int[] answer = arr.clone();

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];

            for (int j = query[0]; j <= query[1]; j++) {
                if (j % query[2] == 0) {
                    answer[j]++;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
