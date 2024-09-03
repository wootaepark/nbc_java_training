package week02;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String structure = scanner.nextLine();
        if (structure.equalsIgnoreCase("List")) {
            String title = scanner.nextLine();
            List<String> strList = new ArrayList<String>();

            while (true) {
                String input = scanner.nextLine();
                if (input.equals("끝")) {
                    break;
                }
                strList.add(input);

            }
            System.out.println("[" + structure + " 로 저장된 " + title + "]" );
            for (int i = 0; i < strList.size(); i++) {
                System.out.println((i + 1) + "." + strList.get(i));
            }
        } else if (structure.equalsIgnoreCase("Set")) {
            String title = scanner.nextLine();
            Set<String> strSet = new HashSet<String>();
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("끝")) {
                    break;
                }
                strSet.add(input);
            }
            System.out.println("[" + structure + " 으로 저장된 " + title + "]" );
            Iterator<String> iterator = strSet.iterator();
            for(int i = 0; i < strSet.size(); i++) {
                System.out.println((i+1) + "." + iterator.next());
            }
        }
        else if(structure.equalsIgnoreCase("Map")) {
            String title = scanner.nextLine();
            int count = 1;
            Map<Integer, String> strMap = new HashMap<>();

            while (true) {
                String input = scanner.nextLine();
                if(input.equals("끝")){
                    break;
                }
                strMap.put(count++, input);
            }
            System.out.println("[" + structure + " 으로 저장된 " + title + "]" );

            for (int i=0;i<strMap.size();i++) {

                System.out.println((i+1) + "." + strMap.get(i+1));
            }
        }
        else{
            System.out.println("일치하는 자료구조가 없습니다.");
        }


        scanner.close();
    }
}
