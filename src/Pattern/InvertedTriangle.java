package Pattern;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberInput = Integer.parseInt(scanner.nextLine());

        for (int i = numberInput; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
