// 3개의 정숫값을 입력하고 최대값을 구하여 출력.

import java.util.Scanner;

class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구합니다.");
        System.out.println("a의 값: "); int a = stdIn.nextInt();
        System.out.println("b의 값: "); int b = stdIn.nextInt();
        System.out.println("c의 값: "); int c = stdIn.nextInt();

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최대값은 " + max + "입니다.");
    }
}

// 실행과정
// 1. max 에 a 값을 넣는다
// 2. max 보다 b가 크면 max 에 b를 넣는다.
// 3. max 보다 c가 크면 max 에 c를 넣는다.

// 여러 문장이 순차적으로 실행되는 구조를 순차(sequential) 구조라고 합니다.
// 1은 단순한 대입이지만 2,3 은 if 문이다. ()안에 있는 식을 평가한 결과에 따라 프로그램의 실행 흐름을 변경하는 if 문을 선택(selection) 구조라고 합니다.