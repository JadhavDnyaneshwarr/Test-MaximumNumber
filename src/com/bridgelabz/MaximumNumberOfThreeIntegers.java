package com.bridgelabz;
import java.lang.Integer;
public class MaximumNumberOfThreeIntegers<P extends Comparable<P>> {
    P number1;
    P number2;
    P number3;

    public MaximumNumberOfThreeIntegers() {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public static <P extends Comparable<P>> P maximumNumber(P number1, P number2, P number3){
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
        MaximumNumberOfThreeIntegers<Integer> maximumInteger = new MaximumNumberOfThreeIntegers<>();
        maximumInteger.number1 = 100;
        maximumInteger.number2 = 109;
        maximumInteger.number3 = 190;
        System.out.println("the maximum number is " + maximumInteger.maximumNumber(maximumInteger.number1, maximumInteger.number2, maximumInteger.number3));
        System.out.println();
        MaximumNumberOfThreeIntegers<Float> maximumFloat = new MaximumNumberOfThreeIntegers<>();
        maximumFloat.number1 = 130F;
        maximumFloat.number2 = 184F;
        maximumFloat.number3 = 160F;
        System.out.println("the maximum number is " + maximumFloat.maximumNumber(maximumInteger.number1, maximumInteger.number2, maximumInteger.number3));
        System.out.println();
        MaximumNumberOfThreeIntegers<String> maximumString = new MaximumNumberOfThreeIntegers<>();
        maximumString.number1 = "Apple";
        maximumString.number2 = "Peach";
        maximumString.number3 = "Banana";
        System.out.println("the maximum number is " + maximumString.maximumNumber(maximumInteger.number1, maximumInteger.number2, maximumInteger.number3));
    }
}