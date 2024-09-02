package week02;

public class W05 {
    public static void main(String[] args) {
        // 대입 연산자 : 변수를 바로 연산해서 그 자리에서 저장하는 연산자
        // = (기본연산자), +=, -=, *= ... (복합대입연산자)

        
        // 기본연산자 및 복합대입연산자
        int number = 10;
        number = number + 2;
        System.out.println(number);

        number = number - 2;
        System.out.println(number);


        // 복합대입 연산자

        number += 2;
        System.out.println(number);

        number -=2;
        System.out.println(number);

        number %=2;
        System.out.println(number);
        System.out.println("-------------");

        // 이외에도 *, / 등도 동일하게 위와 같이 쓰인다.

        // ++, --
        number ++ ; //number += 1 과 동일한 표현
        System.out.println(number);

        number --;
        System.out.println(number);


        
        
        
        
        
    }
}
