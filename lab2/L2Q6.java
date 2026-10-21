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

public class L2Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in gram: ");
        double waterInGram = scanner.nextDouble();
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTempF = scanner.nextDouble();
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTempF = scanner.nextDouble();
        
        double M = waterInGram / 1000.0;
        
        double initialTempC = (initialTempF - 32) / 1.8;
        double finalTempC = (finalTempF - 32) / 1.8;
        
        double Q = M * (finalTempC - initialTempC) * 4184;
        
        System.out.printf("The energy needed is %e\n", Q);
        
        scanner.close();
    }
}
