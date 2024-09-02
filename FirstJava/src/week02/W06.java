package week02;

public class W06 {
    public static void main(String[] args) {
        // 대입연산자에서 주의해야 할 점

        // ++, --
        int a = 10;
        int b = 10;
        int val = ++a + b--; // 11 + 10 = 21 , b-- 에서 b 가 먼저 소비되고 감소됨 (문자가 연산자 보다 앞에 있는 경우)

        
        System.out.println(val);
    }
}
