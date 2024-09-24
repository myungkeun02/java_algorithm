public class Multi99Table {
    public static void main(String[] args) {
        String flag = "-".repeat(5);
        System.out.println(flag + "구구단 곱셈표" + flag );

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
