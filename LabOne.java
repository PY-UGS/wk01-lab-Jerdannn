public class LabOne
{
    public static void main(String[] args)
    {
        System.out.println("Example #1");
        System.out.println("Hello, I am Jourdan");
        System.out.println();

        System.out.println("Example #3");
        String moduleCode = "CSC1009";
        switch(moduleCode)
        {
            case "CSC1006":
                System.out.println("Mathematics II");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Structures & Algorithm");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            default:
                System.out.println("Module code doesn't exist");
                break;
        }
        System.out.println();

        System.out.println("Example #4");
        for (int i = 102; i >= 66; i--)
        {
            if (i % 2 != 0)
            {
                System.out.print("The odd number is: " + i);
                System.out.print("\n"); //Prints a newline after each iteration
            }
        }
    }
}