package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.println("Please press \"?\" to see all available options");
        //String s = Console.getStringInput("Enter a string");
        //Integer i = Console.getIntegerInput("Enter an integer");
        //Double d = Console.getDoubleInput("Enter a double.");

        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a integer", i);
        //Console.println("The user input %s as a d", d);


//        Console calc1 = new Console();
//        MainApplication calc = new MainApplication();
//        calc1.run();
//        String input = Console.getStringInput("0");

        Calculator calculator = new Calculator();
        calculator.run();


    }

}


