package week04.homework01;

public class BadInputException extends Exception {
    public BadInputException(String type){
        super("잘못된 입력입니다!" + type + "를 입력해주세요!");
    }
}
