import java.util.Scanner;

/**
 * This is the main class where we will run the project
 */
public class Main {
    public static void main(String[] args) {
        // import the scanner
        Scanner textScan = new Scanner(System.in);

        // create our instance
        Calculator c1 = new Calculator();

        // asking for which operation is being used
        System.out.println("Which operation would you like to perform?");
        String myText = textScan.next();

        // ask to enter two numbers
        System.out.println("Enter your two numbers:");
        int a = textScan.nextInt();
        int b = textScan.nextInt();

        // used to determine which operation to perform and print out the result of that
        switch (myText) {
            case "addition":
                System.out.println(c1.addition(a, b));
                break;
            case "subtraction":
                System.out.println(c1.subraction(a, b));
                break;
            case "division":
                System.out.println(c1.divide(a, b));
                break;
            case "multiplication":
                System.out.println(c1.multiply(a, b));
                break;
            case "modulus":
                System.out.println(c1.modulo(a, b));
                break;
            default:
                throw new RuntimeException();
        }
    }
}
