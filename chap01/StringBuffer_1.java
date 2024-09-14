public class StringBuffer_1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String result = sb.toString();
        System.out.println(result);

        String result2 = "";
        result2 += "hello";
        result2 += " ";
        result2 += "World";
        System.out.println(result2);

        // 두 예제는 결과가 같지만 내부적으로 객체를 생성하고 메모리를 사용하는 과정이 다르다.
        // 첫 번째 예제에서는 StringBuffer 객체를 한 번만 생성하지만 두 번째 예제는 String 자료형에 + 연산이 있을때마다 새로운 String 객체를 생성하므로 총 4개의 String 객체가 만들어진다.
        // 이는 값을 수정할때 메모리 사용과 실행 속도에 차이를 주게된다.
        // 추가적으로 String 자료형은 값이 한 번 생성되면 변경할 수 없다. toUpperCase 같은 메서드를 보면 문자열이 변경되는 것처럼 생각할 수 도있지만, 해당 메서드를 수행할 때 또 다른 String 객체를
        // 생성하여 리턴할 뿐이다. 반면엔 StringBuffer 자료형은 값을 변경 할 수 있으므로 생성된 값을 언제든지 수정할 수 있다.
    }
}
