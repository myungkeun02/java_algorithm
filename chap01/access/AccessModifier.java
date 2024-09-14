package access;

// private = private 이 붙은 변수나 메서드는 해당 클래스 안에서만 접근이 가능하다.
// default = default 가 붙은 변수나 메서드는 동일한 패키지 안에섬나 접근이 가능하다. - 별도의 access modifier 태그를 붙이지 않으면 기본적으로 default 이다.
// protected = protected 가 붙은 변수나 메서드는 동일한 패키지의 클래스 또는 해당 클래스를 상속 받는 클래스에서만 접근이 가능하다.
// public

public class AccessModifier {

    // private
    private String private1 = "private";
    private String getSecret() {
        return this.private1;
    }
    // secret 변수와 getSecret 메서드는 오직 AccessModifier 클래스에서만 접근이 가능하고 다른 클래스에서는 접근이 불가능하다.

    // default
    String default1 = "default";
    String getDefault1() {
        return this.default1;
    }
    // default1 변수와 메서드는 access 패키지 내부에 있는 AccessModifier, AccessModifier2 에서 접근이 가능하고 외부 패키지에서는 접근이 불가능하다.

    //protected
    protected String protected1 = "protected";
    protected String getProtected1() {
        return this.protected1;
    }
    // protected1 변수와 getProtected1 메서드는 access 패키지 내부에 있는 AccessModifier, AccessModifier2 에서 접근이 가능하고
    // 추가로 동일한 패키지가 아닌 외부 패키지에서 해당 클래스를 상속하는 클래스가 있다면 위치와 무관하게 접근이 가능하다.

    //public
    public String public1 = "public";
    public String getPublic1() {
        return this.public1;
    }
    // public1 변수와 getPublic1 메서드는 클래스의 경로와 무관하게 어떤 클래스라도 접근이 가능하다.
}
