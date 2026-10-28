/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

/**
 *
 * @author USER
 */
import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int p1Roll1 = rand.nextInt(6) + 1;
        int p1Roll2 = rand.nextInt(6) + 1;
        int p1Total = p1Roll1 + p1Roll2;
        
        int p2Roll1 = rand.nextInt(6) + 1;
        int p2Roll2 = rand.nextInt(6) + 1;
        int p2Total = p2Roll1 + p2Roll2;
        
        System.out.println("Player 1 rolls: " + p1Roll1 + " and " + p1Roll2 + " (Total: " + p1Total + ")");
        System.out.println("Player 2 rolls: " + p2Roll1 + " and " + p2Roll2 + " (Total: " + p2Total + ")");
        
        if (p1Total > p2Total) {
            System.out.println("Player 1 wins!");
        } else if (p2Total > p1Total) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}