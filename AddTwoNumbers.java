import java.util.Scanner;

/**
 * add 2 numbers
 * @author Suyash Patel
 */
public class AddTwoNumbers {
    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        double second = scanner.nextInt();
        double sum = first + second;
        System.out.println(first + " + " + second + " = " + sum);
        scanner.close();
    }   
}
