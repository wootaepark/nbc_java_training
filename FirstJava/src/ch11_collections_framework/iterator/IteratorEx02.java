package ch11_collections_framework.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx02 {
    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>();
        ArrayList<String> copy1 = new ArrayList<>();
        ArrayList<String> copy2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            original.add(i + "");
        }

        Iterator<String> it = original.iterator();
        while (it.hasNext()) {
            copy1.add(it.next());
        }
        System.out.println("= original 에서 copy1로 복사(copy)");
        System.out.println("original: " + original);
        System.out.println("copy1: " + copy1);
        System.out.println();


        it = original.iterator(); // iterator 는 재사용이 안되므로 가져온다.

        while (it.hasNext()) {
            copy2.add(it.next()); // 이동 시키고
            it.remove(); // 삭제 (original 의 데이터, original 의 데이터를 가리키는 iterator 이므로)
        }

        System.out.println("= original 에서 copy2로 이동(move) = ");
        System.out.println("original: " + original);
        System.out.println("copy2: " + copy2);


    }
}
