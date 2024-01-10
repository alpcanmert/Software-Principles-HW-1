import java.util.Scanner;

public class NumberRangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        printNumbersInRange(num1, num2);
    }

    private static void printNumbersInRange(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Add a newline for better formatting
    }
}
