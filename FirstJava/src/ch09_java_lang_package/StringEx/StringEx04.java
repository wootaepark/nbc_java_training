package ch09_java_lang_package.StringEx;

public class StringEx04 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        // fullName에서 '.'의 위치를 찾는다.
        int index = fullName.indexOf('.');

        // fullName의 첫번째 글자부터 '.'이 있는 곳까지 문자열을 추출한다.
        String fileName = fullName.substring(0, index);

        String ext = fullName.substring(index+1);

        System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
        System.out.println(fullName + "의 확장자는 " + ext);
    }
}
