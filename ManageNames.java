import java.util.Scanner;

public class ManageNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }
        String longestName = names[0];
        String shortestName = names[0];
        
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            if (name.length() < shortestName.length()) {
                shortestName = name;
            }
        }
        System.out.println("Names in Reverse Order:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(names[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Longest Name: " + longestName);
        System.out.println("Shortest Name: " + shortestName);
    }
}