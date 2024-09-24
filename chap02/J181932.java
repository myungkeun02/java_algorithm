public class J181932 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        StringBuilder result = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char currentChar = code.charAt(i);

            if (currentChar == '1') {
                mode = 1 - mode;
                continue;
            }

            if (i % 2 == mode) {
                result.append(currentChar);
            }
        }

        String answer = result.length() > 0 ? result.toString() : "EMPTY";
        System.out.println(answer);
    }
}