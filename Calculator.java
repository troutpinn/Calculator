import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    System.out.println("Calculator App");

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();

    double sum = num1 + num2;
    // Processes

    double difference = num1 - num2;
    double product = num1 * num2;
    double quotient = num1 / num2;

    // Use formatted output to print the results
    // The
    System.out.printf("Sum: %.2f\n", sum);
    System.out.printf("Difference: %.2f\n", difference);
    System.out.printf("Product: %.2f\n", product);
    System.out.printf("Quotient: %.2f\n", quotient);
  }
}
