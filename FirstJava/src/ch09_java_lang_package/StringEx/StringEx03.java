package ch09_java_lang_package.StringEx;

// String 의 형변환 예시

public class StringEx03 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal);

        double dVal = 200.0;
        String strVal2 = String.valueOf(dVal);

        double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
        // 위 두 값은 동일하다.

        System.out.println(String.join("", strVal, "+",strVal2, "=") + sum);
        System.out.println(strVal + "+" + strVal2 + "=" + sum2);
    }
}
