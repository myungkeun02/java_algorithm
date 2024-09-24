import java.util.Arrays;

public class J181923 {
    public static void main(String[] args) {
        int[] arr = {1, 11, 2, 3};
        int[][] queries = {{0, 3, 1}};
        // int[] arr = {0, 1, 2, 4, 3};
        // int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int[] arr1 = Arrays.copyOfRange(arr, query[0], query[1] + 1);
            int minGreater = Integer.MAX_VALUE;
            boolean found = false;

            for (int a : arr1) {
                if (a > query[2] && a < minGreater) {
                    minGreater = a;
                    found = true;
                }
            }

            answer[i] = found ? minGreater : -1;
        }

        System.out.println(Arrays.toString(answer));
    }
}