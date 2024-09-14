// 3개의 정숫값 가운데 최댓값을 구하여 출력

class Max3Method {
    // a,b,c 의 최대값을 구하여 반환
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3, 2, 1));
        System.out.println("max3(3,2,1) = " + max3(3, 2, 2));
        System.out.println("max3(3,2,1) = " + max3(3, 1, 2));
        System.out.println("max3(3,2,1) = " + max3(3, 2, 3));
        System.out.println("max3(3,2,1) = " + max3(2, 1, 3));
        System.out.println("max3(3,2,1) = " + max3(3, 3, 2));
        System.out.println("max3(3,2,1) = " + max3(3, 3, 3));
        System.out.println("max3(3,2,1) = " + max3(2, 2, 3));
        System.out.println("max3(3,2,1) = " + max3(2, 3, 1));
        System.out.println("max3(3,2,1) = " + max3(2, 3, 2));
        System.out.println("max3(3,2,1) = " + max3(1, 3, 2));
        System.out.println("max3(3,2,1) = " + max3(2, 3, 3));
        System.out.println("max3(3,2,1) = " + max3(1, 2, 3));
    }
}

// 최대값을 여러번 반복해서 구할 떄에는 메서드로 처리하면 편리합니다. 위 에서는 int형 매개변수 a, b, c 값을 받아 최대값을 구하고 그것을 int 형 값으로 반환하는 메서드 입니다.
// 알고리즘은 다음과 같이 정의할 수 있습니다.
// 어떤 문제를 해결하기 위한 절차로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합

// 위 코드에서 대소관계는 13가지이다. 이 조합을 그림으로 표현하면 나뭇가지의 형태가 되는데 이 것을 결정트리(decision tree) 라고 합니다.
// 결정트리는 왼쪽 끝에서 시작하여 오른쪽으로 나아갑니다. 박스 안의 조건이 성립하면 윗가지로 성립하지 않으면 아랫가지로 뻗어 나갑니다.