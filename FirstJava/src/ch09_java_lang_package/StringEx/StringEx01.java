package ch09_java_lang_package.StringEx;

import java.util.StringJoiner;

// split 을 통해서 구별하고 , join 을 이용하여 String 배열을 합친다.
// StringJoiner 클래스를 이용하여 앞, 뒤 설정도 추가로 가능하다.

public class StringEx01 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/","[","]"); // 1개, 3개만 가능하다.
        for(String s : arr){
            sj.add(s); // '/' 를 통해 구분된다.
        }
        System.out.println(sj.toString());
    }
}
