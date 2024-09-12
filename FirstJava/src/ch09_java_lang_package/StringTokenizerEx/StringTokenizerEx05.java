package ch09_java_lang_package.StringTokenizerEx;

import java.util.StringTokenizer;

public class StringTokenizerEx05 {
    public static void main(String[] args) {
        String data = "100,,,200,300";

        String[] result = data.split(",");
        StringTokenizer st = new StringTokenizer(data, ",");

        for(int i=0;i<result.length;i++){ // 단순히 split을 이용한 경우
            System.out.print(result[i] + "|");
        }
        System.out.println("개수 : " + result.length);

        int i=0;
        for(;st.hasMoreElements();i++){
            System.out.print(st.nextElement() + "|");
        }
        System.out.println("개수 : " + i);
    }
}
