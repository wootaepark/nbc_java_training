package week02;

public class W08 {
    public static void main(String[] args) {

        // (1) 연산자 우선순위
        // 산술, 비교, 논리, 대입 순서

        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z; // && 가 나중에 실행
        System.out.println(result);
        System.out.println("---------");


        result = x + 10 < y && y < z; // +, <, && 순서로 진행
        System.out.println(result);


        // 위 경우 모두 ()를 통해 우선순위를 부여할 수 있다.
    }
}
