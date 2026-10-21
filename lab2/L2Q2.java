/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the price of the car (P): ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter down payment (D): ");
        double downPayment = scanner.nextDouble();
        
        System.out.print("Enter interest rate in % (R): ");
        double interestRate = scanner.nextDouble();
        
        System.out.print("Enter loan duration in years (Y): ");
        double years = scanner.nextDouble();
        
        double monthlyPayment = (price - downPayment) * (1 + interestRate * years / 100) / (years * 12);
        
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        
        scanner.close();
    }
}
