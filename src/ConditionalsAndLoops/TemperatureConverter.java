package ConditionalsAndLoops;

import java.util.Objects;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = Double.parseDouble(scanner.nextLine());

        System.out.print("Fahrenheit or Celcius (c or f): ");
        String unit = scanner.nextLine().toLowerCase();

        double convertedTemperature = 0;

        if (Objects.equals(unit, "c")){
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f degree Celsius is %.2f degree Fahrenheit\n", temperature, convertedTemperature);
        } else if (Objects.equals(unit, "f")) {
            convertedTemperature = (temperature - 32) * ((double) 5 / 9);
            System.out.printf("%.2f degree Fahrenheit is %.2f degree Celsius\n", temperature, convertedTemperature);
        } else {
            System.out.println("Invalid input, enter c for Celsius or f for Fahrenheit.");
        }
    }
}
