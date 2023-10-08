package ConditionalsAndLoops;

import java.util.Scanner;

public class SimpleIfElse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are bellow the legal age.");
        }
    }
}
