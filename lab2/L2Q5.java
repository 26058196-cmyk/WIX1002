/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author USER
 */
import java.util.Random;

public class L2Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int number = rand.nextInt(10001);
        
        int temp = number;
        int sumOfDigits = 0;
        
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        
        System.out.println("Generated number: " + number);
        System.out.println("Sum of all the digits: " + sumOfDigits);
    }
}