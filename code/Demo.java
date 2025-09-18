package com.eazybytes.accounts;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }


    /**
     * Method to perform addition operation on two numbers.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of two numbers
     */
    public static int add(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
        return num1 + num2;
    }

    /**
     * Method to perform subtraction operation on two numbers.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the difference of two numbers
     */
    public static int subtract(int num1, int num2) {
        System.out.println("Difference: " + (num1 - num2));
        return num1 - num2;
    }

    /**
     * Method to perform multiplication operation on two numbers.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the product of two numbers
     */
    public static int multiply(int num1, int num2) {
        System.out.println("Product: " + (num1 * num2));
        return num1 * num2;
    }

    /**
     * Method to perform division operation on two numbers.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the quotient of two numbers
     */
    public static int divide(int num1, int num2) {
        System.out.println("Quotient: " + (num1 / num2));
        return num1 / num2;
    }
}
