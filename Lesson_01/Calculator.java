public class Calculator {
    public static void main(String[] args) {
        int firstInputNumber = 30;
        int secondInputNumber = 6;
        char mathSign = '+';

        if(mathSign == '+' ) {
            System.out.println(firstInputNumber + secondInputNumber);
        } else if(mathSign == '-') {
            System.out.println(firstInputNumber - secondInputNumber);
        } else if(mathSign == '*') {
            System.out.println(firstInputNumber * secondInputNumber);
        } else if(mathSign == '/') {
            System.out.println(firstInputNumber / secondInputNumber);
        } else if(mathSign == '^') {
            int result = firstInputNumber;
            for(int i = 1; i < secondInputNumber; i++) {
                firstInputNumber *= result;
            }
            System.out.println(firstInputNumber);
        } else if(mathSign == '%') {
            System.out.println(firstInputNumber % secondInputNumber);
        }
    }
}