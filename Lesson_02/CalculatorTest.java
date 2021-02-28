import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while(true) {
            System.out.print("Введите первое число: ");
            calculator.setFirstInputNumber(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Введите знак математической операции: ");
            calculator.setMathSign(scanner.nextLine());
            System.out.print("Введите второе число: ");
            calculator.setSecondInputNumber(scanner.nextInt());

            calculator.calculate();

            String answer = scanner.nextLine();
            while(true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
                    if(answer.equals("yes") || (answer.equals("no"))) {
                        break;
                    } else {
                        System.out.println("Повторите ввод");
                    }
            }

            if(answer.equals("yes")) {
                continue;
            } else {
                break;
            }
        }
    }
}