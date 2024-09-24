import java.util.Scanner;

public class J181945{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char c : a.toCharArray()) {
            sb.append(c);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
