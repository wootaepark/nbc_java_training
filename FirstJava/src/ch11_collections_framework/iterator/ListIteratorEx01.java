package ch11_collections_framework.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator<String> it = list.listIterator();
        // List 인터페이스를 구현한 컬렉션에서만 사용이 가능 (Set, Map 은 불가능)
        // 애초에 Map 은 Collection 을 구현 하지도 않음


        System.out.println("순방향 진행");
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("역방향 진행");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
