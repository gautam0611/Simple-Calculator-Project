import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // ask for which operation
        Scanner textScan = new Scanner(System.in);

        // create our instance
        Calculator c1 = new Calculator();

        System.out.println("Which operation would you like to perform?");
        String myText = textScan.next();

        System.out.println("Enter your two numbers:");
        int a = textScan.nextInt();
        int b = textScan.nextInt();

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
