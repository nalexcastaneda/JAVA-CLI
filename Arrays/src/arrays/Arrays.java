/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Nestor Alexander
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner data = new Scanner(System.in);
                int i, j;
                int array[][] = new int[2][2];
                int num;
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array.length; j++) {
                    System.out.println("Ingresar un número para la posición " + i + "," + j);
                    num = data.nextInt();
                    array[i] [j] = num;
                }
            }
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array.length; j++) {
                    System.out.println("[" + i + "]" + "[" + j + "] = " + array[i][j]);
                }
                System.out.println(" ");
            }
            
        }
}