package CSC1009_Lab.Lab_1;
import java.util.Scanner;

public class Q2B {
    public static void main(String[] args) {
        System.out.println("Question 2:");
        // Creates a new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a module code: ");
        String moduleCode = input.nextLine();
        // Scanner needs to be closed after
        // note: this means you cannot use System.in again
        input.close();

        switch (moduleCode) {
            case "CSC1006":
                System.out.println("Mathematics II");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Structures & Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            // Note that every switch-case needs a default case
            default:
                System.out.println("Module code doesn't exist");
                break;
        }
    }
}
