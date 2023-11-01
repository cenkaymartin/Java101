import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maths, physics, chem, biology, hist, music;

        System.out.println("Welcome to the Grade Average Calculator ^^");

        System.out.print("Enter your Mathematics Grade: ");
        maths = input.nextInt();

        System.out.print("Enter your Physics Grade: ");
        physics = input.nextInt();

        System.out.print("Enter your Chemistry Grade: ");
        chem = input.nextInt();

        System.out.print("Enter your Biology Grade: ");
        biology = input.nextInt();

        System.out.print("Enter your History Grade: ");
        hist = input.nextInt();

        System.out.print("Enter your Music Grade: ");
        music = input.nextInt();

        double average = (maths + physics + chem + biology + hist + music) / 6.0;
        System.out.println("Your average: " + average);

        String result = (average >= 60) ? "Congratulations! You have successfully passed the class." : "Unfortunately, you failed the class.";
        System.out.println(result);

    }
}