package com.PluralsightTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 22.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        if (args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }
            for (double currentResult : results)
                System.out.println(currentResult);
        } else if (args.length == 3)
            handleCommandLine(args);
        else {
            System.out.println("Please provide an operation code and two numerical values");
        }

    }

    static void executeInteractively(){
        System.out.println("enter an operation and two numbers");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        //scanner and or regex wont work.
        String[] parts = userInput.split(regex: " ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts){
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute (opCode, leftVal, rightVal);
        System.out.println(result);
    }
    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result = 0;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
        }
        // System.out.println("Hello world!");

        // int myNum;
        //myNum = 7;
        //System.out.println(myNum);
        /*
        double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';

        if(opCode == 'a')
            result = value1 + value2;
        else if(opCode == 's')
            result = value1 - value2;
        else if(opCode == 'm')
            result = value1 * value2;
        else if (opCode == 'd')
            if (value2 != 0)
                result = value1 / value2;
            else {
                System.out.println("Invalid opCode" + opCode);
                result = 0.0d;
            }
            System.out.println(result);
         */
        // Arrays done in Java are not the same as Ruby.
        /*
        int iVal = 100;
        String sVal = String.valueOf(iVal);
        System.out.println(sVal);
        */
        return result;
    }

    static char opCodeFromString(String opertationName) {
        char opCode = opertationName.charAt(0);
        return opCode;
    }
    
    static double valueFromWord(String word){
        String[] numberWords = {
                "zero","one","two","three","four","five","six","seven","eight","nine"
        };
        double value = 0d;
        for(int i = 0; i < numberWords.length; i++){
            if(word.equals(numberWords[i])){
                value = i;
                break;
            }
        }
        return value;
    }
} // end of program