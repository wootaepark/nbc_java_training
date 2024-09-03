package week03.homework;

public class Main {
    public static void main(String[] args) {
        
       // 테스트 코드
        Calculator calculator = new Calculator(new AddOperation());

        double add = calculator.calculate(2,3);
        System.out.println(add); // 5.0

        calculator.setCalculator(new SubstractOperation());
        double sub = calculator.calculate(2,3);
        System.out.println(sub); // -1.0

        calculator.setCalculator(new MultiplyOperation());
        double mul = calculator.calculate(2,3); // 6.0
        System.out.println(mul);

        calculator.setCalculator(new DivideOperation());
        double div = calculator.calculate(3,2); // 1.5
        System.out.println(div);



    }
}
