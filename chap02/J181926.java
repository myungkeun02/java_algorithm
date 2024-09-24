public class J181926 {
    public static void main(String[] args) {
        String control = "wsdawsdassw";
        int answer = 0;
        for (int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w':
                    answer += 1;
                    break;
                case 's':
                    answer -= 1;
                    break;
                case 'a':
                    answer += 10;
                    break;
                case 'd':
                    answer -= 10;
                    break;
            }
        }
        System.out.println(answer);
    }
}
