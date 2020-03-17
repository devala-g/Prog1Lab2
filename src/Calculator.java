import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        double userInput1;
        double userInput2;
        int menuInput;
        double userOperation;
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter first operand:");
        userInput1 = scnr.nextDouble();
        System.out.print("Enter second operand:");
        userInput2 = scnr.nextDouble();

        System.out.println("Calculator Menu\n" +
                "---------------\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division");

        System.out.print("Which operation do you want to perform?");
        menuInput = scnr.nextInt();
        if (menuInput == 1){
            userOperation = userInput1 + userInput2;
            System.out.print("The result of the operation is " + userOperation + ". Goodbye!");
        }
        else if (menuInput == 2){
            userOperation = userInput1 - userInput2;
            System.out.print("The result of the operation is " + userOperation + ". Goodbye!");
        }
        else if (menuInput == 3){
            userOperation = userInput1 * userInput2;
            System.out.print("The result of the operation is " + userOperation + ". Goodbye!");
        }
        else if (menuInput == 4){
            userOperation = userInput1 / userInput2;
            System.out.print("The result of the operation is " + userOperation + ". Goodbye!");
        }
        else if (menuInput > 4){
            System.out.print("Error: Invalid selection! Terminating program.");
        }
        else if (menuInput < 1){
            System.out.print("Error: Invalid selection! Terminating program.");
        }
    }
}
