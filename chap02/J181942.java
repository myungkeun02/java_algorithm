public class J181942 {
    public static void main(String[] args) {
        String a = "aaaaaa";
        String b = "bbbbbb";

        StringBuilder sb = new StringBuilder();

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        for (int i=0; i<aArray.length; i++) {
            sb.append(aArray[i]).append(bArray[i]);
        }

        System.out.println(sb.toString());
    }
}
