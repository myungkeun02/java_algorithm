import java.util.ArrayList;
import java.util.Arrays;

public class J181919 {
    public static void main(String[] args) {
        int n = 10;

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = n; i > 1; i = i % 2 == 0 ? i /2 : 3 * i + 1 ) {
            answer.add(i);
        }
        answer.add(1);
        System.out.println(Arrays.toString(answer.toArray()));
//        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
