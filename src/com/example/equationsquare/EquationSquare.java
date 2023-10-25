package com.example.equationsquare;

import java.util.Scanner;

public class EquationSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program will calculate roots of a quadratic equation ax2 + bx + c = 0");
        System.out.println("Please enter the real coefficients a, b and c.");

        System.out.print("a = ");
        float a = input.nextFloat();

        if (a == 0) {
            System.out.println("The equation with a = 0 is not a quadratic equation.");
        } else {
            System.out.print("b = ");
            float b = input.nextFloat();

            System.out.print("c = ");
            float c = input.nextFloat();

            System.out.println();
            System.out.println("You entered coefficients for the quadratic equation:");
            System.out.printf("%.2f * x2 + %.2f * x + %.2f = 0%n", a, b, c);

            float delta = (float) (Math.pow(b, 2) - 4 * a * c);

            int numberOfRoots;
            if (delta < 0) {
                numberOfRoots = 0;
            } else if (delta == 0) {
                numberOfRoots = 1;
            } else {
                numberOfRoots = 2;
            }

            float x1, x2;
            switch (numberOfRoots) {
                case 0:
                    System.out.println("The equation does not have real roots");
                    break;
                case 1:
                    x1 = -b / 2 * a;
                    System.out.printf("The equation has a single real root: x1 = %.2f%n", x1);
                    break;
                case 2:
                    float deltaSquareRoot = (float) Math.pow(delta, 0.5);
                    x1 = (-b - deltaSquareRoot) / (2 * a);
                    x2 = (-b + deltaSquareRoot) / (2 * a);
                    System.out.printf("The equation has two real roots: x1 = %.2f, x2 = %.2f%n", x1, x2);
                    break;
            }
        }
    }
}
