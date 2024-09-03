package week03.sample;

public class Main {

    static final double PI = 3.14; // 상수
    public static void main(String[] args) {
        Main main = new Main(); // 기본 생성자 내장되어 있음(Main)
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
        System.out.println(PI); // 3.14
        // PI = PI + 1; (상수 변경은 오류 발생)
    }

    
    // 메서드
    // 소멸 : 메서드 종료 시
    public int getNumber(){
        
        // 지역 변수 <-> 전역변수
        int number = 1;
        number += 1;
        return number;
    }
}
