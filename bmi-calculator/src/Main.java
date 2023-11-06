import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height, weight, bmi;

        System.out.print("Please enter your height (e.g. 1,72): ");
        height = input.nextDouble();
        System.out.print("Please enter your weight (e.g. 80): ");
        weight = input.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your body mass index: " + bmi);
    }
}