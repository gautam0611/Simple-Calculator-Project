
public class Calculator implements CalculatorFunctions {
    // add two numbers
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int subraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public int modulo(int a, int b) {
        return a % b;
    }
}
