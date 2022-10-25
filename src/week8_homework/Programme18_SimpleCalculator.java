package week8_homework;

public class Programme18_SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public double setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
        return firstNumber;
    }
    public double setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
        return secondNumber;
    }
    public double getAdditionResult() {
        double sum = firstNumber + secondNumber;
        return sum;
    }

    public double getSubtractionResult() {
        double sub = firstNumber - secondNumber;

        return sub;
    }
    public double getMultiplicationResult() {
        double multi = firstNumber * secondNumber;
        return multi;
    }


    public double getDivisionResult() {
        double div = firstNumber / secondNumber;
        if (secondNumber == 0) {
            return 0;
        }
        return div;
    }

    public static void main(String[] args) {
        Programme18_SimpleCalculator calculator = new Programme18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber((4));
        System.out.println(("add=" + calculator.getAdditionResult()));
        System.out.println(("subtraction =" + calculator.getSubtractionResult()));
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply =" + calculator.getMultiplicationResult());
        System.out.println(("divide= " + calculator.getDivisionResult()));
    }


}



