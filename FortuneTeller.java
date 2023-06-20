import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String retirement;
        String bankBalance;
        String vacation;
        String transportation;
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age % 2 == 0)
            retirement = "20 years";
        else
            retirement = "27 years";
        System.out.println("Enter your birth month in number format");
        int birthMonth = scanner.nextInt();
        if (birthMonth >= 1 && birthMonth <= 4)
            bankBalance = "$357,001.34";
        else if (birthMonth <= 8)
            bankBalance = "$7,299,305.22";
        else if (birthMonth <= 12)
            bankBalance = "$96.85";
        else
            bankBalance = "$0.97";
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
            } else
                System.out.println("You entered an invalid color! Please try again.");

            System.out.println("Enter your favorite ROYGBIV color. Type Help to print ROYGBIV colors");
            favoriteColor = scanner.nextLine();
        }
        if (favoriteColor.equalsIgnoreCase("red"))
            transportation = "Electric car";
        else if (favoriteColor.equalsIgnoreCase("orange"))
            transportation = "Taxi";
        else if (favoriteColor.equalsIgnoreCase("yellow"))
            transportation = "Motorcycle";
        else if (favoriteColor.equalsIgnoreCase("green"))
            transportation = "Space ship";
        else if (favoriteColor.equalsIgnoreCase("blue"))
            transportation = "Bus";
        else if (favoriteColor.equalsIgnoreCase("indigo"))
            transportation = "Airplane";
        else
            transportation = "Boat";
        System.out.println("Enter number of siblings");
        int siblings = scanner.nextInt();
        scanner.close();
        if (siblings < 0)
            vacation = "North Korea";
        else if (siblings == 0)
            vacation = "India";
        else if (siblings == 1)
            vacation = "Canada";
        else if (siblings == 2)
            vacation = "Iceland";
        else if (siblings == 3)
            vacation = "England";
        else
            vacation = "Philippines";

        System.out.println(firstName + " " + lastName + " will retire in " + retirement + " with " + bankBalance +
                " in the bank, a vacation home in " + vacation + ", and travel by " + transportation + ".");
    }

    public static void displayRoygbivColors() {
        System.out.println("The ROYGBIV colors are: ");
        System.out.println("      --Red--");
        System.out.println("      --Orange--");
        System.out.println("      --Yellow--");
        System.out.println("      --Green--");
        System.out.println("      --Blue--");
        System.out.println("      --Indigo--");
        System.out.println("      --Violet--");
    }
}
