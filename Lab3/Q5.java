/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        
        double denominator = (a * d) - (b * c);
        
        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = ((e * d) - (b * f)) / denominator;
            double y = ((a * f) - (e * c)) / denominator;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        
        sc.close();
    }
}