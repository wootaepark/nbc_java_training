package ch09_java_lang_package.StringTokenizerEx;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
    public static void main(String[] args) {
        String source = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(source,","); // 만약 두번째 인자가 없으면 디폴트로 공백문자, 개행문자로 취급
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
