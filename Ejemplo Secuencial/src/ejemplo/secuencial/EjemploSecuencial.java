/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.secuencial;

import java.util.Scanner;

/**
 *
 * @author Nestor Alexander
 */
public class EjemploSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaración de variables 
        int n1, n2; 
        Scanner sc = new Scanner(System.in); //leer el primer número 
        System.out.println("Introduce un número entero: "); n1 = sc.nextInt(); //lee un entero por teclado 
        //leer el segundo número 
        System.out.println("Introduce otro número entero: "); 
        n2 = sc.nextInt(); //lee un entero por teclado 
        //mostrar resultado 
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);
    }
    
}
