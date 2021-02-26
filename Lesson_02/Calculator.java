public class Calculator {
    private int firstInputNumber;
    private int secondInputNumber;
    private String mathSign;

    public int getFirstInputNumber() {
        return firstInputNumber;
    }

    public void setFirstInputNumber(int firstInputNumber) {
        this.firstInputNumber = firstInputNumber;
    }

    public int getSecondInputNumber() {
        return secondInputNumber;
    }

    public void setSecondInputNumber(int secondInputNumber) {
        this.secondInputNumber = secondInputNumber;
    }

    public String getMathSign() {
        return mathSign;
    }

    public void setMathSign(String mathSign) {
        this.mathSign = mathSign;
    }

    public void calc(Calculator calculator) {
        switch(this.mathSign) {
            case "+":
                System.out.println(this.firstInputNumber + this.secondInputNumber);
                break;
            case "-":
                System.out.println(this.firstInputNumber - this.secondInputNumber);
                break;
            case "*":
                System.out.println(this.firstInputNumber * this.secondInputNumber);
                break;
            case "/":
                System.out.println(this.firstInputNumber / this.secondInputNumber);
                break;
            case "^":
                int result = this.firstInputNumber;
                for(int i = 1; i < this.secondInputNumber; i++) {
                    this.firstInputNumber *= result;
                }
                System.out.println(this.firstInputNumber);
                break;
            case "%":
                System.out.println(this.firstInputNumber % this.secondInputNumber);
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }
}