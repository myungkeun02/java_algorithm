import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class J181916 {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int c = 2;
        int d = 5;
        int answer;

        int[] arr = {a, b, c, d};

        Arrays.sort(arr);

        answer = arr[0] == arr[3] ? a * 1111 :
                arr[0] == arr[2] ? (10 * arr[0] + arr[3]) * (10 * arr[0] + arr[3]) :
                        arr[1] == arr[3] ? (10 * arr[1] + arr[0]) * (10 * arr[1] + arr[0]) :
                                arr[0] == arr[1] && arr[2] == arr[3] ? (arr[0] + arr[2]) * (Math.abs(arr[0] - arr[2])) :
                                        arr[0] == arr[1] ? arr[2] * arr[3] :
                                        arr[1] == arr[2] ? arr[0] * arr[3] :
                                        arr[2] == arr[3] ? arr[0] * arr[1] :
                                                arr[0];

        System.out.println(answer);
    }
}
