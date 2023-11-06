import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price, vatRate = 0.18, vatAmount, newPrice;

        System.out.println("Welcome to the VAT Calculator");
        System.out.print("Enter the price: ");
        price = input.nextDouble();

        vatAmount = price * vatRate;
        newPrice = price + vatAmount;

        System.out.println("Price: " + price);
        System.out.println("VAT Rate: " + vatRate);
        System.out.println("VAT Amount: " + vatAmount);
        System.out.println("Price with VAT: " + newPrice);
    }
}