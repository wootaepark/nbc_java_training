package week04.homework01;


public class Calculator {
    private int firstNumber;
    private int secondNumber;

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public Calculator() {
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getSecondNumber(){
        return secondNumber;
    }

    public double calculate() throws BadInputException{
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }

}
