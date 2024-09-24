public class J181934 {
    public static void main(String[] args) {
        String ineq = "<";
        String eq = "=";
        int n = 20;
        int m = 50;
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                System.out.println(n < m);
            } else {
                System.out.println(!(n <m));
            }
        } else {
            if (eq.equals("=")) {
                System.out.println(n > m);
            } else {
                System.out.println(!(n > m));
            }
        }
        System.out.println();
    }
}
