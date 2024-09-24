package 문법;

import java.io.*;
import java.util.Scanner;

class ConsoleInputOutput {

    public static void main(String[] args) throws IOException {
//        InputStream in = System.in;
//
//        int a;
//        a = in.read(); // InputStream 의 read 매서드는 1byte 의 데이터만 읽는다. (ex) abc 를 입력하면 a 만 받아와서 아스키 코드로 변환하기에 97이 콘솔창에 나타나게 된다.)
//
//        System.out.println(a);
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        char[] a = new char[3];
//        reader.read(a);
//
//        System.out.println(a);

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();
        System.out.println(a);

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());

        // 대표적인 두가지 입출력 방식
    }
}