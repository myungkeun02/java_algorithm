import java.util.ArrayList;

public class J181918 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};

        ArrayList<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            while (!answer.isEmpty() && answer.get(answer.size() - 1) >= num) {
                answer.remove(answer.size() - 1);
            }
            answer.add(num);
        }

        System.out.println(answer);
    }
}
