import java.util.*;

public class J181909 {
    public static void main(String[] args) {
        String my_string = "banana";
        List<String> my_list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            my_list.add(my_string.substring(i));
        }
        Collections.sort(my_list);
        System.out.println(my_list);
//        return my_list.toArray(new String[0]);
    }
}
