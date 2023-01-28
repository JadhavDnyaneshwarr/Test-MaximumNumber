package com.bridgelabz;
import java.lang.Integer;
public class MaximumNumberOfThreeIntegers<P extends Comparable<P>> {
    public P maximumNumber(P number1, P number2, P number3){
        P maximum = number1;
        if (number2.compareTo(maximum) > 0){
            maximum = number2;
        }else if (number3.compareTo(maximum) > 0){
            maximum = number2;
        }
        return maximum;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Test for maximum number");
        MaximumNumberOfThreeIntegers<Integer> maximum1 = new MaximumNumberOfThreeIntegers<>();
        System.out.println("the maximum number is " + maximum1.maximumNumber(100, 4, 54));
    }
}