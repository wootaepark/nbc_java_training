package ch09_java_lang_package;

class Circle implements Cloneable {
    Point p; // Point 클래스는 "CloneEx.java" 에 구현 되어 있다.
    double r;

    Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy() { // 얕은 복사
        Object obj = null;
        try {
            obj = super.clone(); // 단순한 복사로서
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Circle) obj; // 공변 반환 타입을 이용함
    }

    public Circle deepCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Circle c = (Circle) obj;
        c.p = new Point(this.p.x, this.p.y);
        return c;

    }

    public String toString() {
        return "[p = " + p + ", r = " + r + "]";
    }

}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1, 1), 2.0);
        Circle c2 = c1.shallowCopy(); // 얕은 복사
        Circle c3 = c1.deepCopy(); // 깊은 복사

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        c1.p.x = 9;
        c1.p.y = 9;

        System.out.println("= c1의 변경 후 = ");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        // 다 다르게 나온다.
        System.out.println(System.identityHashCode(c1));
        System.out.println(System.identityHashCode(c2));
        System.out.println(System.identityHashCode(c3));

    }
}