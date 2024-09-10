package ch09_java_lang_package;
class Point implements Cloneable {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString(){ // 오버라이딩
        return "x=" + x + ", y=" + y;
    }

    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone(); // 반드시 예외 처리가 필요
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return obj;
    }
}

public class CloneEx {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point)original.clone();
        System.out.println(original);
        System.out.println(copy);


        // 만약 clone() 메서드를 return this; 를 통해서 하면 자기 자신의 참조가되므로 아래 두 결과 출력이 동일하게 된다.
        System.out.println(System.identityHashCode(original));
        System.out.println(System.identityHashCode(copy));


    }
}
