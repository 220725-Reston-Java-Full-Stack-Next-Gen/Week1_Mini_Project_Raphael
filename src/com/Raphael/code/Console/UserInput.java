package com.Raphael.code.Console;


/************************************************
** Project: Interface to get user input
** Author:  Raphael Gakau
** Date:    10/29/2018
*************************************************/

public interface UserInput {
    
    // methods to get user input (int, double, and string)
    int getInt(String prompt);
    int getInt(String prompt, int min, int max);
    
    double getDouble(String prompt);
    double getDouble(String prompt, double min, double max);
    
    String getString(String prompt);
    String getString(String prompt, String s1, String s2);
    
}
