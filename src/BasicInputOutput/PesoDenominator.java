package BasicInputOutput;

import java.util.Scanner;

public class PesoDenominator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        System.out.printf("%d - 1000\n", (int) amount / 1000);
        System.out.printf("%d - 500\n", (int) (amount % 1000) / 500);
        System.out.printf("%d - 200\n", (int) (amount % 1000 % 500) / 200);
        System.out.printf("%d - 100\n", (int) (amount % 1000 % 500 % 200) / 100);
        System.out.printf("%d - 50\n", (int) (amount % 1000 % 500 % 200 % 100) / 50);
        System.out.printf("%d - 20\n", (int) (amount % 1000 % 500 % 200 % 100 % 50) / 20);
        System.out.printf("%d - 10\n", (int) (amount % 1000 % 500 % 200 % 100 % 50 % 20) / 10);
        System.out.printf("%d - 5\n", (int) (amount % 1000 % 500 % 200 % 100 % 50 % 20 % 10) / 5);
        System.out.printf("%d - 1\n", (int) (amount % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5));
    }
}
