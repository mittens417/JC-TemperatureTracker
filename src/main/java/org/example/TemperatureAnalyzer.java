package org.example;
import java.util.Scanner;

public class TemperatureAnalyzer {
    static String day1TempStr;
    static String day2TempStr;
    static String day3TempStr;

    static double day1TempPrimitive;
    static double day2TempPrimitive;
    static double day3TempPrimitive;

    static Double day1TempWrapper;
    static Double day2TempWrapper;
    static Double day3TempWrapper;

    static float day1TempFloat;
    static int day2TempInt;
    public static void main(String[] args) {

        //Loop for Day 1 High Temp

        Scanner sc = new Scanner(System.in);
        boolean validInput;
        do {
            System.out.print("Enter Day 1 High Temperature (e.g., 28.5):");
            day1TempStr = sc.nextLine();
            try {
                day1TempPrimitive = Double.parseDouble(day1TempStr);
                validInput = true;
            } catch (NumberFormatException a) {
                System.out.println("Error: String input not allowed.");
                System.out.println("Exception Message: " + a.getMessage());
                validInput = false;
            }
        }while (!validInput);

        //Loop for Day 2 High Temp
        do {
            System.out.print("Enter Day 2 High Temperature (e.g., 28.5):");
            day2TempStr = sc.nextLine();
            try {
                day2TempPrimitive = Double.parseDouble(day2TempStr);
                validInput = true;
            } catch (NumberFormatException a) {
                System.out.println("Error: String input not allowed.");
                System.out.println("Exception Message: " + a.getMessage());
                validInput = false;
            }
        }while (!validInput);

        //Loop for Day 3 High Temp
        do {
            System.out.print("Enter Day 3 High Temperature (e.g., 28.5):");
            day3TempStr = sc.nextLine();
            try {
                day3TempWrapper = Double.parseDouble(day3TempStr);
                validInput = true;
            } catch (NumberFormatException a) {
                System.out.println("Error: String input not allowed.");
                System.out.println("Exception Message: " + a.getMessage());
                validInput = false;
            }
        }while (!validInput);

        System.out.println("--- Temperature Analysis ---");
        //Primitive to Wrapper
        day1TempWrapper = Double.valueOf(day1TempPrimitive);
        System.out.println("Parsed Day 1 Temp (primitive double): " + day1TempWrapper);

        day2TempWrapper = Double.valueOf(day2TempPrimitive);
        System.out.println("Parsed Day 2 Temp (primitive double): " + day2TempWrapper);

        //Comparison of temps
        int day1And2 = day1TempWrapper.compareTo(day2TempWrapper);
        if (day1And2 == 0){
            System.out.println("Day 1 (" + day1TempWrapper + "°C) and Day 2 (" + day2TempWrapper + "has the same temperature.");

        } else if (day1And2 > 0) {
            System.out.println("Day 1 (" + day1TempWrapper + "°C) was warmer than Day 2 (" + day2TempWrapper + "°C)");

        } else{
            System.out.println("Day 1 (" + day1TempWrapper + "°C) was colder than Day 2 (" + day2TempWrapper + "°C)");
        }

        //Wrapper to Float
        day1TempFloat = day1TempWrapper.floatValue();
        System.out.println("Extracted Day 1 Temp (primitive float from Double wrapper): " + day1TempFloat);

        //Wrapper to Integer
        day2TempInt = day2TempWrapper.intValue();
        System.out.println("Extracted Day 2 Temp (primitive int from Double wrapper, truncated): " + day2TempInt);

        //Getting the max Temperature
        double maxTemp = Math.max(day1TempPrimitive,Math.max(day2TempPrimitive,day3TempPrimitive));
        System.out.println("The highest temp recorded was: " + maxTemp + "°C");
    }
}