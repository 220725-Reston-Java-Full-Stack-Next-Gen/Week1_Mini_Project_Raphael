package com.Raphael.code.Console;


/******************************************************************
** Project: Console class to validate user input and print output
** Author:  Raphael Gakau
** Date:    10/29/2018
*******************************************************************/

// import the Scanner class from the java.util package
import java.util.Scanner; 

// new class that implements the UserIO interface
public class ConsoleIO implements UserIO {
    
    // create a new scanner object
    Scanner sc = new Scanner(System.in);
    
    public ConsoleIO() {
        
    }
    
    // methods that override the methods in the UserIO interface to print output and validate user entry
    @Override
    public void print(String s) {
         System.out.print(s);
    }

    @Override
    public void println() {
        System.out.println();
    }

    @Override
    public void println(String s) {
        System.out.println(s);
    }

    // method that returns a user input if and only if the input is a valid integer
    @Override
    public int getInt(String prompt) {
        int number = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();
        }
        return number;
    }

    // method that returns a user input if and only if the input is between the defined parameters
    @Override
    public int getInt(String prompt, int min, int max) {
        int number = 0;
        boolean isValid = false;
        while (!isValid) {
            number = getInt(prompt);
            if (number < min) {
                System.out.println("Error! Number must be greater than "+ (min - 1));
            } else if (number > max) {
                System.out.println("Error! Number must be less than "+ (max + 1));
            } else {
                isValid = true;
            }
        }
        return number;
    }

    // method that returns a user input if and only if the input is a valid double
    @Override
    public double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false; // boolean to control if value entered is double or not
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine(); // discard any other data entered on the line
        }
        return d;
    }

    // method that returns a user input if and only if the double is between the specified parameters
    @Override
    public double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false; // boolean to control if value entered is double or not
        while(!isValid) {
            d = getDouble(prompt);
            if (d < min){
                System.out.println("Error! Number must be greater than "+ (min - 1));
            } else if (d > max) {
                System.out.println("Error! Number must be less than "+ (max + 1));
            } else {
                isValid = true;
            }
        }
        return d;
    }

    // method that returns a user input if and only if the user input is a valid string
    @Override
    public String getString(String prompt) {
        boolean isValid = false;
        String s = "";
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equals("")) {
                System.out.println("Error! This entry is required. Try again.");
                isValid = false;
            } else {
                isValid = true;
            }
        }
        
        return s;
    }
    
    // method that returns a string from user input if and only if the string is either of the specified parameters
    @Override
    public String getString(String prompt, String s1, String s2) {
        
        String choice = "";
        boolean isValid = false;
        
        while (!isValid) {
            choice = getString(prompt);
            if (!(choice.equalsIgnoreCase(s1) || choice.equalsIgnoreCase(s2))) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + "'. Try again.");
                isValid = false;
            } else {
                isValid = true;
            }
        }
        return choice;
    }
    
}
