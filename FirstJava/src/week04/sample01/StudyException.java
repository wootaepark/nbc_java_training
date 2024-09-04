package week04.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();


        try{
            ourClass.thisMethodIsDangerous();
        }catch(OurBadException e){ // e 를 통해 인스턴스화 (보통 e)
            System.out.println(e.getMessage()); // 우리가 예외 처리 생성시 super를 통해 등록한 메시지
        }
        finally {
            // 무조건 실행
            System.out.println("우리는 방금 예외를 핸들링 함, ");
        }
    }
}
