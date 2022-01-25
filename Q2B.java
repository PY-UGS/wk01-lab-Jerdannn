package Lab_1;

public class Q2B {
    public static void main(String[] args) {
        System.out.println("Example #3");
        String moduleCode = "CSC1009";

        switch(moduleCode) {
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
            //Switch should always have a default case
            default:
                System.out.println("Module code doesn't exist");
                break;
        }
    }
}
