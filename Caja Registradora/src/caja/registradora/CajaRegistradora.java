/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja.registradora;

import java.util.Scanner;

/**
 *
 * @author Nestor Alexander
 */
public class CajaRegistradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String ra;
    int sum = 0;
        do{
            Scanner pr = new Scanner(System.in);
            System.out.print("Introducir precio del producto (valor en número): ");
            int producto;
            producto = pr.nextInt();
            sum += producto;
            System.out.print("*******************\n" + "    " + "Total: " + "   " + sum+"\n********************\n");            
            Scanner ar = new Scanner(System.in);
            System.out.print("      Introduce R para ingresar otro producto o caulquier otro caracter para detener\n");
            ra = ar.next();
        }
        while(ra.equals("R"));
       }
    
}
