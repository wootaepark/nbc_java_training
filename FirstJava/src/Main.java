import java.util.Scanner;


// week 1 assignment
public class Main {
    public static void main(String[] args) {

        // 1주차 숙제 : 요리 레시피 메모장 만들기

        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        double score = scanner.nextDouble();
        scanner.nextLine(); // 버퍼를 비움으로서 자동 입력되지 않도록 한다.
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String str4 = scanner.nextLine();
        String str5 = scanner.nextLine();
        String str6 = scanner.nextLine();
        String str7 = scanner.nextLine();
        String str8 = scanner.nextLine();
        String str9 = scanner.nextLine();
        String str10 = scanner.nextLine();

        System.out.println("[" + title + "]");
        System.out.println("별점: " + (int)score);
        System.out.println("1." + str1);
        System.out.println("2." + str2);
        System.out.println("3." + str3);
        System.out.println("4." + str4);
        System.out.println("5." + str5);
        System.out.println("6." + str6);
        System.out.println("7." + str7);
        System.out.println("8." + str8);
        System.out.println("9." + str9);
        System.out.println("10." + str10);



        scanner.close();

    }
}
