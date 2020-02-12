package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value: " + myMinFloatValue);
        System.out.println("Float max value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value: " + myMinDoubleValue);
        System.out.println("Double max value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue =  5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double pounds = 345.764d;
        double poundsToKg = 0.45359237d;
        double result = pounds * poundsToKg;
        System.out.println(result);
    }
}
