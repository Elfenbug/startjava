public class Calculator {
    private int firstInputNumber;
    private int secondInputNumber;
    private String mathSign;

    public void setFirstInputNumber(int firstInputNumber) {
        this.firstInputNumber = firstInputNumber;
    }

    public void setSecondInputNumber(int secondInputNumber) {
        this.secondInputNumber = secondInputNumber;
    }

    public void setMathSign(String mathSign) {
        this.mathSign = mathSign;
    }

    public void calculate() {
        switch(mathSign) {
            case "+":
                System.out.println(firstInputNumber + secondInputNumber);
                break;
            case "-":
                System.out.println(firstInputNumber - secondInputNumber);
                break;
            case "*":
                System.out.println(firstInputNumber * secondInputNumber);
                break;
            case "/":
                System.out.println(firstInputNumber / secondInputNumber);
                break;
            case "^":
                int result = firstInputNumber;
                for(int i = 1; i < secondInputNumber; i++) {
                    firstInputNumber *= result;
                }
                System.out.println(firstInputNumber);
                break;
            case "%":
                System.out.println(firstInputNumber % secondInputNumber);
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }
}