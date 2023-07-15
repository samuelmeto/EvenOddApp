import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        // Program to determine whether entered numbers are even or odd and print them to the screen.
        // Let's try to use conditions, loops, arrays, methods, and the Scanner topic.

        System.out.println("Program to determine whether a number is even or odd");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int arrayLength = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the value at index " + i + ": ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int value : numbers) {
            checkEvenOdd(value);
        }

        scanner.close();
    }

    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}
