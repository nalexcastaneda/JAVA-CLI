/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doWhile;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Nestor Alexander
 */
public class WhileDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random an = new Random();
        int numeroAleatorio = an.nextInt(20);
        int intentos = 0;
        Scanner in = new Scanner(System.in);
        int adivina;
        boolean correcto = false;
        while(correcto==false){
         System.out.print("Adivina un número del 1-20: ");
         adivina = in.nextInt();
         intentos++;
         if (adivina==numeroAleatorio){
             correcto=true;
         }
         else if(adivina<numeroAleatorio){
             System.out.print("¡Intenta con un número mas grande!\n");
         }
         else if(adivina>numeroAleatorio){
             System.out.print("¡Intenta con un número mas pequeño\n");
         }
        }
        System.out.print("\n¡GANASTE!");
        System.out.print("\nEl número era " + numeroAleatorio);
        System.out.print("\nTe tomó " + intentos + " intentos\n");
    }
    
}
