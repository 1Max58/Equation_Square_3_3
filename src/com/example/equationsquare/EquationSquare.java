package com.example.equationsquare;

import java.util.Scanner;

public class EquationSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program will calculate the roots of the quadratic equation ax2 + bx + c = 0");
        System.out.println("Please enter the coefficients a, b and c.");

        System.out.print("a = ");
        float a = input.nextFloat();

        System.out.print("b = ");
        float b = input.nextFloat();

        System.out.print("c = ");
        float c = input.nextFloat();

        float delta = (float) (Math.pow(b, 2) - 4 * a * c);

        float x1 = (float) ((-b - Math.pow(delta, 0.5)) / (2 * a));
        float x2 = (float) ((-b + Math.pow(delta, 0.5)) / (2 * a));

        System.out.printf("x1 = %.2f%n", x1);
        System.out.printf("x2 = %.2f%n", x2);
    }
}
