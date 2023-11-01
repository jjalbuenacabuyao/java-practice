package ConditionalsAndLoops;

import java.util.Objects;
import java.util.Scanner;

public class AverageChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Math: ");
        double mathGrade = Double.parseDouble(scanner.nextLine());

        System.out.print("Science: ");
        double scienceGrade = Double.parseDouble(scanner.nextLine());

        System.out.print("English: ");
        double englishGrade = Double.parseDouble(scanner.nextLine());

        double average = (mathGrade + scienceGrade + englishGrade) / 3;
        System.out.printf("Average: %f\n", average);

        String failedSubjects = "";

        final double passingGrade = 75;

        if (mathGrade < passingGrade){
            failedSubjects += " Math,";
        } else if (scienceGrade < passingGrade) {
            failedSubjects += " Science,";
        } else if (englishGrade < passingGrade) {
            failedSubjects += " English,";
        }

        if (average < passingGrade){
            System.out.println("Sorry you failed the semester.");
        } else if (average >= passingGrade && Objects.equals(failedSubjects, "")) {
            System.out.println("Congratulations, you have passed the semester.");
        } else {
            System.out.println("Congratulations, you have passed the semester. But you need to re-enroll" + failedSubjects);
        }
    }
}
