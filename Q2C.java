package CSC1009_Lab.Lab_1;

public class Q2C {
    public static void main(String[] args) {
        System.out.println("Question 3:");
        String s = "";
        // For-loop to print out odd numbers
        // note: start, end, step
        for (int i = 102; i >= 66; i--) {
            // If 'i' is not divisible by 2, store 'i'
            if (i % 2 != 0) {
                s += i + ", ";
            }
        }
        // Substring can be used to remove the last few
        // characters of a string
        s = s.substring(0, s.length() - 2);
        System.out.println(s);
    }
}
