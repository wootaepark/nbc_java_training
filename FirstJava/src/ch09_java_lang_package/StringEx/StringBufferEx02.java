package ch09_java_lang_package.StringEx;

public class StringBufferEx02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01"); // capacity : 18 로서 이는 유지된다 (넘어가지만 않으면)
        StringBuffer sb2 = sb.append("23");
        sb.append('4').append(56); // 자동으로 String 형식으로 변환된다.

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);

        System.out.println("sb = " + sb);
        System.out.println("sb2 = " + sb2);
        System.out.println("sb3 = " + sb3);

        System.out.println("sb = " + sb.deleteCharAt(10));
        System.out.println("sb2 = " + sb2.delete(3,6));
        System.out.println("sb3 = " + sb3.insert(3,"abc"));
        System.out.println("sb = " + sb.replace(6, sb.length(), "END"));
        sb.append("123123123s"); // 넘어가게 되면 20이 증가

        System.out.println("capacity=" + sb.capacity());
        System.out.println("length=" + sb.length());

    }
}
