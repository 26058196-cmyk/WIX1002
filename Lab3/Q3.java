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

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter sales volume: ");
        double sales = sc.nextDouble();
        
        double commissionRate = 0;
        
        if (sales <= 100) {
            commissionRate = 0.05;
        } else if (sales <= 500) {
            commissionRate = 0.075;
        } else if (sales <= 1000) {
            commissionRate = 0.10;
        } else {
            commissionRate = 0.125;
        }
        
        double commission = sales * commissionRate;
        System.out.printf("Commission: %.2f%n", commission);
        
        sc.close();
    }
}