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

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        
        System.out.print("Enter coordinate point (x, y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        double distance = Math.sqrt(x * x + y * y);
        
        if (distance < radius) {
            System.out.println("Point (" + x + ", " + y + ") is inside the circle.");
        } else if (distance == radius) {
            System.out.println("Point (" + x + ", " + y + ") is on the circle.");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is outside the circle.");
        }
        
        sc.close();
    }
}