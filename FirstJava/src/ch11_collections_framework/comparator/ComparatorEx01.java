package ch11_collections_framework.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx01 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr); // String의 Comparable 구현에 의한 정렬
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 x
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr=" + Arrays.toString(strArr));

    }

}
class Descending implements Comparator { // 사용자 정의 Comparator
    public int compare(Object o1, Object o2) { // 오버라이딩 필수
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            // Comparable 로 형변환

            return c1.compareTo(c2) * -1; // 기본 정렬방식의 역으로 변경한다.
            // c2.compareTo(c1) * -1 과 같이 해도 된다.
        }
        return -1;
    }
}