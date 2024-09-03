package week03.homework;


public class Calculator {

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) { // 생성자
        this.operation = operation;
    }

    public void setCalculator(AbstractOperation operation){ // setter
        this.operation = operation;
    }


    double calculate(int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }


}
