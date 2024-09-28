import java.util.Scanner;

public class piramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.printf("피라미드를 출력합니다.");
        do {
            System.out.print("몇 단 삼각형 입니까? :");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
