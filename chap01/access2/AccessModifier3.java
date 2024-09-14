package access2;

import access.AccessModifier;

public class AccessModifier3 extends AccessModifier {
    public static void main(String[] args) {
        AccessModifier3 accessModifier3 = new AccessModifier3();
        String protected1 = accessModifier3.protected1; // 외부 패키지에서 접근
        String getProtected1 = accessModifier3.getProtected1();
    }
}