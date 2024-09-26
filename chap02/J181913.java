import java.util.Arrays;

public class J181913 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        char[] charArr = my_string.toCharArray();
        for (int[] query : queries) {
            char[] copy = Arrays.copyOfRange(charArr, query[0], query[1] + 1);
            for (int i = 0; i < copy.length; i++) {
                charArr[query[0] + i] = copy[copy.length - 1- i];
            }
        }

        String new_string = new String(charArr);
        System.out.println(new_string);
    }
}
