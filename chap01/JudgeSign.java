import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요. :");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("이 수는 양수입니다.");
        if (n < 0)
            System.out.println("이 수는 음수입니다.");
        else
            System.out.println("이 수는 0입니다.");
        // if (n = 0)
        //  System.out.println("이 수는 0입니다.");  -> 이런식으로 하지 않는 이유는 코드 상으로는 3개의 분기로 보이지만 else; 가 숨겨져 있기에
        // 사실상 4개의 분기가 생성되어 비효율적이기 때문이다.
    }
}
