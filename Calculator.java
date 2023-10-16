/**
 * This is the class where we will implement the basic functionalities of a calculator
 */
public class Calculator implements CalculatorFunctions {
    // add two numbers
    public int addition(int a, int b) {
        return a + b;
    }

    // subtract two numbers
    @Override
    public int subraction(int a, int b) {
        return a - b;
    }

    // multiply two numbers
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    // divide the two numbers
    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    // modulus the two numbers
    @Override
    public int modulo(int a, int b) {
        return a % b;
    }
}
