package com.example.hackerrank;

import java.util.Scanner;

/**
 * There are different kinds of calculators which are available in the market for different purposes. Sam wants to make a calculator which can return the sum of two integers.
 *
 * Implement the Adder class which should follow the following:
 * It should inherit from the Calculator class .
 * It should implement the method add(int a, int b) which should calculate and return the sum of two integer parameters, a and b.
 *
 * The locked stub code in the editor consists of the following:
 * An abstract class named Calculator which contains an abstract method, add(int a, int b).
 * A solution class which
 * creates an object of the Adder class.
 * reads the inputs and passes them in a method called by the object of the Adder class.
 *
 * Constraints
 * 0 < a, b < 105
 * **/
abstract class calculator {
    public abstract int add(int a, int b);
}

class Adder extends calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

/** TEST CASES**/
/*public class calc { public static void main(String[] args) {
        Adder adder = new Adder();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = adder.add(a, b);
        System.out.println("The Sum is:  " + sum);
        scanner.close();
    }*/

