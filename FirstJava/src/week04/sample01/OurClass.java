package week04.sample01;

public class OurClass {
    private final boolean just = true;

    // throws
    public void thisMethodIsDangerous() throws OurBadException{ // 위험하다는 flag 를 달아준 것
        if(just){
            throw new OurBadException();
            // 항상 예외가 발생한다.
        }
    }

}
