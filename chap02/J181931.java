public class J181931 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean[] included = {true, false, false, true, true};
    //                        3     7      11     15    19
        int answer = a;

        for (int i = 0; i < included.length; i++) {
            if (included[i] && i > 0) {
                answer = answer + a + b * i;
                System.out.println(answer);
            }
        }

        System.out.println(answer);
    }
}
