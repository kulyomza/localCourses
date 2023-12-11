package lesson28.calculator;

public class Launcher {

    public static void main(String[] args) {
        IOperation additional = (value1, value2) -> value1 + value2;
        Calculator calculator = new Calculator(additional);
        double additionalResult = calculator.performOperation(2,2);
        System.out.println("Result additional " + additionalResult);

        IOperation subtraction = (value1, value2) -> value2 - value1;
        calculator.setIOperation(subtraction);
        double subtractionResult = calculator.performOperation(10, 5);
        System.out.println("Result subtraction " + subtractionResult);

    }
}
