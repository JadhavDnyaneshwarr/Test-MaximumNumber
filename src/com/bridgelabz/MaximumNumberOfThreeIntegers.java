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
        System.out.println("the maximum number is " + maximum1.maximumNumber(100, 14, 54));
        System.out.println("the maximum number is " + maximum1.maximumNumber(100, 114, 54));
        System.out.println("the maximum number is " + maximum1.maximumNumber(100, 114, 154));
        MaximumNumberOfThreeIntegers<Float> maximum2 = new MaximumNumberOfThreeIntegers<>();
        System.out.println("the maximum number is " + maximum2.maximumNumber(101F, 69F, 51F));
    }
}