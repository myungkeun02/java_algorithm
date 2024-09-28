public class J181911 {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            String my_string = my_strings[i].substring(parts[i][0], parts[i][1] + 1);
            System.out.println(my_string);
            builder.append(my_string);
        }
        System.out.println(builder.toString());
    }
}
