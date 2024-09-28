import java.util.ArrayList;
import java.util.Arrays;

public class J181912 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (String str : intStrs) {
            String subStr = str.substring(s, s + l);
            int strInt = Integer.parseInt(subStr);
            if (strInt > k) {
                answer.add(strInt);
            }
        }
        System.out.println(answer);
        //        return answer.stream().mapToInt(i -> i).toArray();
    }
}
