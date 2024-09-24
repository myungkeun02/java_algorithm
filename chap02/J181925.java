import java.util.Arrays;

public class J181925 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        for (int i = 1; i < numLog.length; i++) {
            switch (numLog[i] - numLog[i - 1]) {
                case 1:
                    sb.append("w");
                    break;
                case -1:
                    sb.append("s");
                    break;
                case 10:
                    sb.append("d");
                    break;
                case -10:
                    sb.append("a");
            }
        }
        System.out.println(sb.toString());
    }
}
