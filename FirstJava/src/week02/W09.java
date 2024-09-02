package week02;

public class W09 {
    public static void main(String[] args) {

        // 자동 형변환 (더 큰 데이터형태로 변하는 경우)
        short x = 10;
        int y = 20;

        int z = x + y; // short 가 int 로 변환 (자동 형변환)

        long lx = 30L;
        long lz = z + lx;

        float fx = x; // float 로 변환됨
        float fy = y;

        System.out.println(lx);
        System.out.println(lz);
        System.out.println(fx);
        System.out.println(fy);
    }
}
