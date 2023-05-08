import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second nubmer : ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Change Operetion (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Operation not recognized.");
                return;
        }

        System.out.println("Result : " + result);
    }
}
