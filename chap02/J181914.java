import java.math.BigInteger;

public class J181914 {
    public static void main(String[] args) {
        String number = "78720646226947352489";
        BigInteger num = new BigInteger(number).mod(BigInteger.valueOf(9));
        System.out.println(num);
    }
}
