package calculate;

public class Calculator {


    // addition method
    public void addition(int a, int b){
        System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
    }

    //subtraction method
    public void subtraction(int a, int b){
        System.out.println("Subtractions of " + a + " and " + b + " is: " + (a - b));
    }

    //division method
    public void division(int a, int b) {
        if (b != 0) {
            int result = a / b;
            System.out.println("Division of " + a + " by " + b + " is: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    // multiplication method
    public void multiplication(int a, int b){
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
    }

    public void calculateResult(int a, int b, char symbol){

        switch (symbol){
            case '+':
                addition(a,b);
                break;
            case '-':
                subtraction(a,b);
                break;
            case '/':
                division(a,b);
                break;
            case '*':
                multiplication(a,b);
                break;
            default:
                System.out.println("Invalid symbol. Supported symbols are +, -, *, /");
        }
    }
}
