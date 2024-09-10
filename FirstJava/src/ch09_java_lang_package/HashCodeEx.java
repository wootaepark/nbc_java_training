package ch09_java_lang_package;

public class HashCodeEx {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2)); // true, (String 클래스에서 오버라이딩 됨)
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode()); // 항상 동일한 값으로 나온다.

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
