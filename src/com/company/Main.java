package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of a circle: ");
        double answer = scanner.nextDouble();

        Circle circle = new Circle(answer);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());





    }
}
