public class Calculator {
    public static void main(String[] args) {
        int firstInputNumber = 30;
        int secondInputNumber = 6;
        char selectOper = '+';

        if(selectOper == '+' ) {
            System.out.println(firstInputNumber + secondInputNumber);
        } else if(selectOper == '-') {
            System.out.println(firstInputNumber - secondInputNumber);
        } else if(selectOper == '*') {
            System.out.println(firstInputNumber * secondInputNumber);
        } else if(selectOper == '/') {
            System.out.println(firstInputNumber / secondInputNumber);
        } else if(selectOper == '^') {
            int counter = firstInputNumber;
                for(int i = 1; i < secondInputNumber; i++) {
                    firstInputNumber*=counter;
                }
            System.out.println(firstInputNumber);
        } else if(selectOper == '%') {
            System.out.println(firstInputNumber % secondInputNumber);
        }
    }
}