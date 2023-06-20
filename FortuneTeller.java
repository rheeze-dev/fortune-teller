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
        while (!favoriteColor.equalsIgnoreCase("red")
                && !favoriteColor.equalsIgnoreCase("orange")
                && !favoriteColor.equalsIgnoreCase("yellow")
                && !favoriteColor.equalsIgnoreCase("green")
                && !favoriteColor.equalsIgnoreCase("blue")
                && !favoriteColor.equalsIgnoreCase("indigo")
                && !favoriteColor.equalsIgnoreCase("violet")) {
            if (favoriteColor.equalsIgnoreCase("help")) {
                displayRoygbivColors();
            } else {
                System.out.println("You entered an invalid color! Please try again.");
            }
            System.out.println("Enter your favorite ROYGBIV color. Type Help to print ROYGBIV colors");
            favoriteColor = scanner.nextLine();
        }
        System.out.println("Enter number of siblings");
        int siblings = scanner.nextInt();
        scanner.close();

        if (age % 2 == 0)
            System.out.println("20 years.");
        else
            System.out.println("21 years.");
        if (siblings < 0)
            System.out.println("North Korea.");
        else if (siblings == 0)
            System.out.println("India.");
        else if (siblings == 1)
            System.out.println("Canada.");
        else if (siblings == 2)
            System.out.println("Egypt.");
        else if (siblings == 2)
            System.out.println("England.");
        else
            System.out.println("Philippines.");
        if (favoriteColor.equalsIgnoreCase("red"))
            System.out.println("Electric car");
        else if (favoriteColor.equalsIgnoreCase("orange"))
            System.out.println("Taxi");
        else if (favoriteColor.equalsIgnoreCase("yellow"))
            System.out.println("Motorcycle");
        else if (favoriteColor.equalsIgnoreCase("green"))
            System.out.println("Space ship");
        else if (favoriteColor.equalsIgnoreCase("blue"))
            System.out.println("Bus");
        else if (favoriteColor.equalsIgnoreCase("indigo"))
            System.out.println("Airplane");
        else
            System.out.println("Boat");
        if (birthMonth >= 1 && birthMonth <= 4)
            System.out.println("Your bank balance is $357,001.34");
        else if (birthMonth <= 8)
            System.out.println("Your bank balance is $7,299,305.22");
        else if (birthMonth <= 12)
            System.out.println("Your bank balance is $96.85");
        else
            System.out.println("Your bank balance is $0.97");
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
