import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a number: ");
        int value = scanner.nextInt(); // Read user input as an integer

        if (value % 2 == 0) {
            System.out.println("The Given Number \"" + value + "\" is Even");
        } else {
            System.out.println("The Given Number \"" + value + "\" is Odd");
        }
    }
}
