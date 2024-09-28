public class J181908 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana";

        String string = my_string.substring(my_string.length() - is_suffix.length());
        System.out.print(string.equals(is_suffix) ? 1 : 0);

        //        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}
