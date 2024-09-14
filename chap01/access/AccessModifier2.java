package access;

public class AccessModifier2 {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        String a = accessModifier.default1;
        String b = accessModifier.getDefault1();

        System.out.println(a);
        System.out.println(a);

    }
}
