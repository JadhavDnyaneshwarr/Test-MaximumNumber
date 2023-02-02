package com.bridgelabz;
import java.lang.Integer;
public class MaximumNumberOfThreeIntegers {
    public static  <P extends Comparable<P>> P maximumNumber(P number1, P number2, P number3){
        P maximum = number1;
        if (number2.compareTo(maximum) > 0){
            maximum = number2;
            if (number3.compareTo(maximum) > 0) {
                maximum = number3;
            }
            else if (number3.compareTo(maximum) < 0) {
                maximum = number2;
            }
        }else if (number2.compareTo(maximum) < 0){
            maximum = number1;
            if (number3.compareTo(maximum) > 0) {
                maximum = number3;
            }
            else if (number3.compareTo(maximum) < 0) {
                maximum = number1;
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Test for maximum number");
        System.out.println("the maximum number is " + maximumNumber(100, 14, 54));
        System.out.println("the maximum number is " + maximumNumber(100, 114, 54));
        System.out.println("the maximum number is " + maximumNumber(100, 114, 154));
        System.out.println();
        System.out.println("the maximum number is " + maximumNumber(101F, 69F, 51F));
        System.out.println("the maximum number is " + maximumNumber(101F, 169F, 51F));
        System.out.println("the maximum number is " + maximumNumber(101F, 169F, 511F));
        System.out.println();
        System.out.println("the maximum string is " + maximumNumber("Apple", "Peach", "Banana"));
    }
}