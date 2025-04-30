package com.Array;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }
    static int sumDigits(int n)
    {
        if(n<=9)
        {
            return n;
        }
        return (n%10)+ sumDigits(n/10);
    }
}

