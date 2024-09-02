package week02;

public class W02 {

    public static void main(String[] args) {


        // 사칙연산 다루기
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1
        System.out.println("-----------");

        // 우선순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println("-----------");

        // 변수 이용 연산
        int a = 20;
        int b = 10;
        int c;

        // 덧셈
        c = a + b; // 30
        System.out.println(c);

        c = a - b; // 10
        System.out.println(c);

        c = a * b; // 200
        System.out.println(c);

        c = a / b; // 2
        System.out.println(c);

        c = a % b; // 0
        System.out.println(c);


    }
}
