import java.util.Scanner;

public class CalculatorV3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char choice;

        do {

            System.out.println("\n===== Java Calculator Version 3 =====");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");

            System.out.print("Enter your choice: ");
            int operation = input.nextInt();

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            double result = 0;

            switch (operation) {

                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;

                case 5:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot find modulus with zero.");
                    } else {
                        result = num1 % num2;
                        System.out.println("Result: " + result);
                    }
                    break;

                case 6:
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Calculator Version 3!");

        input.close();
    }
}