import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, ch, result;

        System.out.print("Enter the first number: ");
        n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        System.out.println("---\n1 - (+)\n2 - (-)\n3 - (*)\n4 - (/)");
        System.out.print("Please choose an operator: ");
        ch = input.nextByte();

        switch (ch) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("A number cannot be divided by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator entered.");
                return;
        }
        System.out.println("Result is: " + result);
    }
}