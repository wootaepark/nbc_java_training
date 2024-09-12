package ch09_java_lang_package.StringEx;

public class StringBufferEx01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2)); // false
        System.out.println("sb.equals(sbw) ? " + (sb.equals(sb2))); // false

        String s = sb.toString();
        String s2 = sb2.toString();

        // StringBuffer 클래스에서는 equal() 메서드가 오버라이딩 되어 있지 않기 때문에
        // String 형태로 변환하여 비교 연산을 진행한다.
        System.out.println("s.equals(s2) ? " + (s.equals(s2))); // true
    }
}
