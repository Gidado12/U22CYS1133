import java.util.Scanner;

public class Explore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exploration Calculator");
        System.out.print("Input your first number: ");
        double num1 = getNumber(scanner);
        System.out.print("Input your preferred operation (+, -, *, /): ");
        char operator = getOperator(scanner);
        System.out.print("Input your second number: ");
        double num2 = getNumber(scanner);
        double result = performCalculation(num1, num2, operator);
        System.out.println("Result: " + result);
    }

    private static double getNumber(Scanner scanner) {
        while(true) {
            System.out.print("Input a number: ");

            try {
                double number = Double.parseDouble(scanner.next());
                return number;
            } catch (NumberFormatException var4) {
                System.out.println("Input not suitable. Please enter a valid number.");
            }
        }
    }

    private static char getOperator(Scanner scanner) {
        while(true) {
            System.out.print("Input your preferred operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                return operator;
            }

            System.out.println("Invalid operator. Please enter +, -, *, or /.");
        }
    }

    private static double performCalculation(double num1, double num2, char operator) {
        double result = 0.0;
        switch (operator) {
            case '*':
                result = num1 * num2;
                break;
            case '+':
                result = num1 + num2;
            case ',':
            case '.':
            default:
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                if (num2 != 0.0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is forbidden.");
                    System.exit(1);
                }
        }

        return result;
    }
}