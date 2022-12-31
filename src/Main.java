import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int operand1 = scanner.nextInt();
        System.out.println("Введите операцию");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите второе число");
        int operand2 = scanner.nextInt();
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Неизвестная операция");
        }
        System.out.println("Ответ:" + " " + result);
    }
}