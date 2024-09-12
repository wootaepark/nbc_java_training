package ch09_java_lang_package.MathEx;

import static java.lang.Math.*;

public class MathEx {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE; // 가장 최소값

        System.out.println("i =" + i);
        System.out.println("-i = " + (-i));


        try{
            System.out.printf("negateExact (%d) = %d%n", 10, negateExact(10)); // 부호 변환
            //오버 플로우 발생 시 예외가 발생 하기 때문에 예외 처리 필요
            System.out.printf("negateExact (%d) = %d%n", -10, negateExact(-10));
            System.out.printf("negateExact (%d) = %d%n" ,i, negateExact(i)); // 예외가 발생한다. (long 형으로 변환)
        }catch(ArithmeticException e){
            System.out.println("long 의 형태로 변환함");
            System.out.printf("negateExact (%d) = %d%n", (long)i, negateExact((long)i));
        }
    }
}
