import java.util.*;

public class J181930 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;

        List<Integer> numList = Arrays.asList(a, b, c);
        Set<Integer> numSet = new HashSet<>(numList);

        if (numSet.size() == 3) {
            System.out.print(a + b + c);
        }
        if (numSet.size() == 2) {
            System.out.print((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        }
        if (numSet.size() == 1) {
            System.out.print((a + b+ c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        }


    }
}

//class Solution {
//    public int solution(int a, int b, int c) {
//        List<Integer> numList = Arrays.asList(a, b, c);
//        Set<Integer> numSet = new HashSet<>(numList);
//
//        int answer = 0;
//
//        if (numSet.size() == 3) {
//            answer = a + b + c;
//        }
//        if (numSet.size() == 2) {
//            answer = (a + b + c)
//                    * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
//        }
//        if (numSet.size() == 1) {
//            answer = (a + b+ c)
//                    * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
//                    * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
//        }
//        return answer;
//    }
//}