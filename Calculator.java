import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter Operator(+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter Second Number: ");
        double num2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Can't Divide by Zero!");
                    return ;
                }
                break;

            default:
                System.out.println("Invalid Operator!");
                return;
        }

        System.out.println("Result: " + result);
        input.close();
    }
}