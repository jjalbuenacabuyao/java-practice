package BasicInputOutput;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().toUpperCase();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.printf("Name: %s\nAge: %d", name, 2023 - birthYear);
    }
}
