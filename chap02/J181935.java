public class J181935 {
    public static void main(String[] args) {
        int n = 4;
        int answer = 0;
        if (n%2 == 1) {
            for (int i = 1; i <= n; i+=2) {
                answer += i;
            }
        } else {
            for (int i = 0; i <= n; i+=2) {
                answer += i*i;
            }
        }
        System.out.println(answer);
    }
}

