import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값 :");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 0;
        for (i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
