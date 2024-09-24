import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = Integer.parseInt(str);

        System.out.println(str.repeat(n));
    }
}
