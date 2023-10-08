package Pattern;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= inputNumber; row++){
            for (int col = 1; col <= inputNumber; col++){
                if (row == 1 || col == 1 || row == inputNumber || col == inputNumber){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
