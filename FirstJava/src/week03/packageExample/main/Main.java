package week03.packageExample.main;
import week03.packageExample.pk1.Car;
//import week03.packageExample.pk2.Car;
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        week03.packageExample.pk2.Car car2= new week03.packageExample.pk2.Car();
        // 동시에 사용하지 못한다. (같은 이름이기 때문에, 자바가 혼동함)

        car1.hron();
        car2.hron();
    }
}
