package BasicInputOutput;

import java.util.Scanner;

public class BasicMathOperation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the second number: ");
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double sum = firstNumber + secondNumber;

        System.out.printf("%f plus %f equals %f", firstNumber, secondNumber, sum);
    }
}
