/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labtask;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Boomerang {
    public static void main(String[] args) {
        int[][] points = {{1, 1}, {2, 3}, {3, 2}};
        
        int x1 = points[0][0];
        int y1 = points[0][1];
        
        int x2 = points[1][0];
        int y2 = points[1][1];
        
        int x3 = points[2][0];
        int y3 = points[2][1];
        
        if ((y2 - y1) * (x3 - x1) != (y3 - y1) * (x2 - x1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}