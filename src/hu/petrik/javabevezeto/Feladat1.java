package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Kérem adja meg a medence átmérőjét: ");
        double diameter = sc.nextDouble();
        System.out.print("Kérem adja meg a medence magasságát: ");
        double height = sc.nextDouble();
        double radius = diameter / 2;
        double area = radius * radius * Math.PI;
        double volume = area * height;
        System.out.printf("A medence térfogata %.3f köbméter", volume);
    }
}
