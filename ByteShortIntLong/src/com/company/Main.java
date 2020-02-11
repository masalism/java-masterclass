package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10_000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Bute Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Bute Maximum Value = " + myMaxShortValue);
        
        long myLongValue = 10000000000000000L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Bute Maximum Value = " + myMaxLongValue);
        long bingLong = 2_147_483_647_234L;
        System.out.println(bingLong);

        short bigShort = 32767;
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue / 2);

        byte myByte = 54;
        short myShort = 7544;
        int myInt = 7657455;
        long myLong = 50000L + ((myByte + myShort + myInt) * 10L);
        System.out.println(myLong);
        short shortTotal = (short)(1000 + 10 * (myByte + myShort + myInt));
        System.out.println(shortTotal);
    }
}
