package week03.interTv;

public class Main {
    public static void main(String[] args) {

        // LG TV 구현체를 조작
        // 자동 형 변환
        MultiRemoteController mrc = new LgTv("LG");
        mrc.turnOnOff();
        mrc.volumeUp();
        mrc.channelDown();
        mrc.channelUp();
        mrc.turnOnOff();

        // 조작 대상을 Samsung TV로 교체
        System.out.println("\n<Samsung TV로 교체>");
        mrc = new SamsungTv("Samsung");
        mrc.turnOnOff();
        mrc.channelUp();
        mrc.volumeDown();
        mrc.volumeUp();
        mrc.turnOnOff();

        // 매개변수, 반환타입 다형성 체크
        System.out.println("\n<매개변수, 반환타입 다형성 체크>");

        MultiRemoteController samsung = mrc.getTV(new SamsungTv("Samsung"));
        samsung.turnOnOff();

        // samsung.esc(); // 오버라이딩 이외 불가능
        SamsungTv samsungTv = (SamsungTv) samsung;
        samsungTv.turnOnOff();
        samsungTv.esc(); // 강제형 변환을 통해 접근 가능


        System.out.println();
        MultiRemoteController lg = mrc.getTV(new LgTv("LG"));
        lg.turnOnOff();

        LgTv lgTv = (LgTv) lg;
        lgTv.turnOnOff();

    }
}