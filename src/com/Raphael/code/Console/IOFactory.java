package com.Raphael.code.Console;


/**********************************************************************************
** Project: Class returns instance of a class that implements the UserIO interface
** Author:  Raphael Gakau
** Date:    10/29/2018
***********************************************************************************/

public class IOFactory{
    
    // static method that returns an instance of any class that implements the UserIO interface
    public static UserIO getUserIO(String s) {
        ConsoleIO console = new ConsoleIO();
        return console;
    }
}
