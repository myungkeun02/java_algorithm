import java.util.Arrays;

public class J181901 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int[] result = solution(n, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = k * (i + 1);
        }
        return answer;
    }
}