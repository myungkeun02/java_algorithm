import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J181921 {
    public static void main(String[] args) {
        int l = 5;
        int r = 555;

        List<Integer> ans = new ArrayList<>();

        int start = ((l + 4) / 5) * 5;

        for (int i = start; i <= r; i=i+5) {
            String numStr = i + "";

            String and = numStr.replaceAll("5", "");
            and = and.replaceAll("0", "");
            if (and.equals("")) {
                ans.add(i);
            }
        }
        if (ans.size() == 0) {
            ans.add(-1);
        }
        System.out.print(ans.stream().mapToInt(Integer::intValue).toArray());
    }
}
