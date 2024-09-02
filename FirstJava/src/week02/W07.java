package week02;

public class W07 {
    public static void main(String[] args) {
        // 기타연산자
        // (1) 형변환 연산자
        int intNumber = 93 + (int)98.8; // 98이 된다.
        System.out.println(intNumber);

        double doubleNumber = (double)93; // 93.0 이된다.
        System.out.println(doubleNumber + 98.8);
        
        // (2) 삼항연산자
        // 비교 연산자와 항상 함께 쓰인다.
        // 조건 ? 참 : 거짓;

        System.out.println("--------");

        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false;
        System.out.println(b);


        String s = (x!=y) ? "정답" : "오답";
        System.out.println(s);


        // (3) instance of (3주차 -> 클래스, 객체)
        // 피 연산자가 조건에 명시된 클래스의 객체인지 비교하여
        // 맞으면 true
        // 틀리면 false
    }
}
