package com.benjaminbroad;

public class Main {

    public static void main(String[] args) {
        // Assignment operator
        // Addition operator
        int result = 1 + 2;
        System.out.println("Addition: " + result);

        // Subtraction operator
        result = result + 5;
        System.out.println("Subtraction: " + result);

        // Multiplication operator
        result = result * 10;
        System.out.println("Multiplication: " + result);

        // Division operator
        result = result / 5;
        System.out.println("Division: " + result);

        // Remainder operator
        result = result % 3;
        System.out.println("Remainder: " + result);

        // Increment
        result++;
        System.out.println("Increment: " + result);

        // Decrement
        result--;
        System.out.println("Decrement: " + result);

        // Shorthand incrementing/assignment
        result += 2;
        System.out.println("Shorthand incrementing/assignment: " + result);

        // Shorthand multiplication/assignment
        result *= 5;
        System.out.println("Shorthand multiply/assignment: " + result);

        // Equality operator
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("Not an alien!");

        // ==, !=, >, <, >=, <=
        int topScore = 70;
        if (topScore == 100)
            System.out.println("You got the top score!");

        // &&, ||
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score, but less than 100.");

    }
}
