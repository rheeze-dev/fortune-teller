import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your birth month in number format");
        int birthMonth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your favorite ROYGBIV color. Type Help to print ROYGBIV colors");
        String favoriteColor = scanner.nextLine();
        if (favoriteColor.equalsIgnoreCase("Help")) {
            displayRoygbivColors();
        }
        System.out.println("Enter number of siblings");
        int siblings = scanner.nextInt();
        scanner.close();
    }

    public static void displayRoygbivColors() {
        System.out.println("--Red--");
        System.out.println("--Orange--");
        System.out.println("--Yellow--");
        System.out.println("--Green--");
        System.out.println("--Blue--");
        System.out.println("--Indigo--");
        System.out.println("--Violet--");
    }
}
