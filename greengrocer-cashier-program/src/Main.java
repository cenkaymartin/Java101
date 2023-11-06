import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pearKilos, appleKilos, tomatoKilos, bananaKilos;
        double pearKG = 2.14, appleKG = 3.67, tomatoKG = 1.11, bananaKG = 0.95, total;

        System.out.print("How many kilograms of pears?: ");
        pearKilos = input.nextDouble();

        System.out.print("How many kilograms of apples? ");
        appleKilos = input.nextDouble();

        System.out.print("How many kilograms of tomatos?: ");
        tomatoKilos = input.nextDouble();

        System.out.print("How many kilograms of bananas?: ");
        bananaKilos = input.nextDouble();

        total = (pearKilos * pearKG) + (appleKilos * appleKG) + (tomatoKilos * tomatoKG) + (bananaKilos * bananaKG);

        System.out.println("Total Cost: " + total);
    }
}