import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating variables.
        int a, b;
        double c;

        // Getting user input.
        System.out.print("Enter the length of side A: ");
        a = input.nextInt();

        System.out.print("Enter the length of side B: ");
        b = input.nextInt();

        // Calculating.
        c = Math.sqrt((a*a) + (b*b));

        // Printing the result.
        System.out.println("Hypotenuse: " + c);
    }
}