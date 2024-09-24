import java.util.Scanner;

public class J181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder result = new StringBuilder();  // 결과 문자열을 저장할 StringBuilder

        for (char c : a.toCharArray()) {
            if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        System.out.println(result);
        String specialChars = "!@#$%^&*('\\\"<>?:;";
        String aaaaaaaaaaaa = "!@#$%^&*(\\'\"<>?:;";
        String avv = "\"";

    }
}



/*영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.*/

// 대문자 소문자 분류를 어떻게 하는게 효율적일까?

