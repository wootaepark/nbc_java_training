package ch11_collections_framework.arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13}, {21,22,23}};

        System.out.println("arr=" + Arrays.toString(arr));
        System.out.println("arr2D=" + Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr,arr.length);
        int[] arr3 = Arrays.copyOf(arr,3); // 길이가 없으면 컴파일 에러
        int[] arr4 = Arrays.copyOf(arr,7); // 길이 초과 시 0으로 채움
        int[] arr5 = Arrays.copyOfRange(arr, 2,4); // 2부터 3 인덱스 까지 (4제외)
        int[] arr6 = Arrays.copyOfRange(arr,0,7); // 0부터 6인덱스 까지 (0 채워서)


        System.out.println("arr2=" + Arrays.toString(arr2));
        System.out.println("arr3=" + Arrays.toString(arr3));
        System.out.println("arr4=" + Arrays.toString(arr4));
        System.out.println("arr5=" + Arrays.toString(arr5));
        System.out.println("arr6=" + Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7,9);
        System.out.println("arr7=" + Arrays.toString(arr7));

        Arrays.setAll(arr7,i -> (int)(Math.random()*10)+1); // 1부터 10까지
        System.out.println("arr7=" + Arrays.toString(arr7));

        for(int i : arr7){
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i); // 위 랜덤값 만큼 *을 그림
        }

        // 2차원 배열 다루기
        String[][] str2D = new String[][]{{"aaa","bbb"},{"ccc","ddd"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"ccc","ddd"}};


        System.out.println(Arrays.equals(str2D, str2D2)); // 주소값을 비교하게 되므로 무조건 false 가 된다.
        System.out.println(Arrays.deepEquals(str2D, str2D2));

        char[] chArr = {'A','D','C','B','E'};

        System.out.println("chArr=" + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B')); // 정렬 하지 않아서 이상한 값이 나온다.
        System.out.println("= After sorting = ");
        Arrays.sort(chArr);
        System.out.println("chArr=" + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));




    }
}
