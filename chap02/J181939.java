import javax.swing.*;

public class J181939 {
    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        int c = Integer.parseInt((a + "") + (b + ""));
        int d = Integer.parseInt((b + "") + (a + ""));
        System.out.println(Math.max(c, d));
    }
}
