public class J181915 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        char[] my_string_arr = my_string.toCharArray();

        StringBuilder answer = new StringBuilder();

        for (int index : index_list) {
            answer.append(my_string_arr[index]);
        }

        System.out.printf(answer.toString());
    }
}
