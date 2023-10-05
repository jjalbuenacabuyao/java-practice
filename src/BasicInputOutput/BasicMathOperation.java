package BasicInputOutput;

import java.util.Scanner;

public class BasicMathOperation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;

        System.out.printf("%f plus %f equals %f", firstNumber, secondNumber, sum);
    }
}
