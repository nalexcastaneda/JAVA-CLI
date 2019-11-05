/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuencial.or;

import java.util.Scanner;

/**
 *
 * @author Nestor Alexander
 */
public class conditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String sexo;
        String ed = null;
        Scanner nmin = new Scanner(System.in);
        System.out.print("Introducir nombre: ");
        nombre = nmin.next();
        Scanner sxin = new Scanner(System.in);
        System.out.print("Introducir sexo (Femenino, Masculino): ");
        sexo = sxin.next();
        Scanner agin = new Scanner(System.in);
        System.out.print("Introducir edad en número: ");
        int edad; 
        edad = agin.nextInt();
        if (edad<=3){
            ed = "Bebé";
        }
        else if (edad<=11){
            ed = "Niño";
        }
        else if (edad<=19){
            ed = "Adolescente";
        }
        else if (edad<=25){
            ed = "Adulto joven";
        }
        else if (edad<=60){
            ed = "Adulto";
        }
        else if (edad>=61){
            ed = "Adulto mayor";
        }
        System.out.print("\n\n*************************************************************\n");
        System.out.print("      Tu nombre es " + nombre + " tu sexo es " + sexo + " eres un " + ed + "\n");
        System.out.print("*************************************************************\n");
    }
    
}
