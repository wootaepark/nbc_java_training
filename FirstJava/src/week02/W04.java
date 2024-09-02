package week02;

public class W04 {
    public static void main(String[] args) {
        boolean f1 = true;
        boolean f2 = false;
        boolean f3 = true;

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("--------------------");
        System.out.println(f1 || f2); // true
        System.out.println(f1 && f2); // false
        System.out.println(f1 && f3); // true
    }
}
