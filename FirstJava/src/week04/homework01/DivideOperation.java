package week04.homework01;

public class DivideOperation extends AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) throws BadInputException {
        if(secondNumber == 0)
            throw new BadInputException("두번째 수가 0이 아닌 정수");

        return (double)firstNumber / secondNumber;
    }
}
