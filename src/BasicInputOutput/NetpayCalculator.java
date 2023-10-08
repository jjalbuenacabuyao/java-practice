package BasicInputOutput;

import java.util.Scanner;

public class NetpayCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gross salary: ");
        double grossSalary = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the amount of deduction: ");
        double deduction = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().toUpperCase();

        double netpay = grossSalary - deduction;

        System.out.printf("Hi Sir/Ma'am %s, based on the provided information, your netpay is %f", name, netpay);
    }
}
