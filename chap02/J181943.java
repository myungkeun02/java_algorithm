public class J181943 {
//    public String solution(String my_string, String overwrite_string, int s) {
//        return my_string.substring(0, s)
//
//    }

    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        String a = my_string.substring(0,s) + overwrite_string + my_string.substring(s + overwrite_string.length());
        System.out.println(a);
    }

}
