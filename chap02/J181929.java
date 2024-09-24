import java.util.Arrays;

public class J181929 {
    public static void main(String[] args) {
        int[] numList = {5,7,8,3};
        int sum = Arrays.stream(numList).sum();
        int mul = Arrays.stream(numList).reduce(1, (a, b) -> a * b);
        System.out.print(Math.pow(sum, 2) + "\n");
        System.out.print(mul+ "\n");
        System.out.print(Math.pow(2, sum) > mul ? 1 : 0);
    }
}
