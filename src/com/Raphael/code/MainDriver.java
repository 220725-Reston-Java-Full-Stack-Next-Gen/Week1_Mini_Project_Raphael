package com.Raphael.code;

import com.Raphael.code.Console.ConsoleIO;
import com.Raphael.code.Console.IOFactory;
import com.Raphael.code.Console.UserIO;

import java.io.Console;
import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        UserIO console = IOFactory.getUserIO("console");
        String name = console.getString("Enter a name for your thermometer: ");

        Thermometer thermometer = new Thermometer();
        thermometer.setName(name);

        System.out.println("Welcome, thanks for using " + thermometer.getName() + " today!");

        System.out.println();

        int degreesF = console.getInt("Please enter Fahrenheit: ");
        int degreesC = console.getInt("Please enter Celsius: ");

        thermometer.setDegreesF(degreesF);
        thermometer.setDegreesC(degreesC);

        int convertedF = Thermometer.convertToCelsius(thermometer.getDegreesF());
        int convertedC = Thermometer.convertToFahrenheit(thermometer.getDegreesC());

        System.out.println();

        System.out.println(degreesF + "\u00B0F was converted to " + convertedF + "\u00B0C");
        System.out.println(degreesC + "\u00B0C was converted to " + convertedC + "\u00B0F");

        System.out.println();

        System.out.println("Now enter three recent temperature readings.");
        int temp1 = console.getInt("Temp 1: ");
        int temp2 = console.getInt("Temp 2: ");
        int temp3 = console.getInt("Temp 3: ");

        int[] tempValues = {temp1, temp2, temp3};
        thermometer.setTempReadings(tempValues);
        Thermometer.calculateAvgTemp(thermometer.getTempReadings());

        System.out.println();

        System.out.println("Thank you for using the " + thermometer.getName() + " thermometer today. Goodbye!");
    }
}
