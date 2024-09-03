package week03;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class Car {
    
    
    
    // 고유데이터 영역
    String company;
    String model = "GV80";
    String color;
    
    // 상세데이터 영역
    double price;
    double speed;
    char gear; // (P, N, R, D)
    boolean lights = true; // 자동차 조명 상태


    // 객체 영역
    Tire tire = new Tire();
    Door door = new Door();
    Handle handle = new Handle();

    // 생성자 : 처음 객체가 인스턴스 화 될때 어떤 로직을 수행해야 하는지

    public Car() {
        // 기본생성자 (생략 가능)
        System.out.println("객체가 생성됨");
    }

    // 메서드 영역
    double gasPedal(double kmh, char type) {
        speed = kmh;
        changeGear(type); //
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }

    // 자동차의 속도 .. 가변길이 적용
    void carSpeeds(double ... speeds){
        for(double v : speeds){
            System.out.println("v = " + v);
        }
    }

}
