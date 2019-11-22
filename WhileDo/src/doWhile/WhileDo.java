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
        try {
            String pag = null;
            String yes = "S";
            String yeah = "s";
            String not = "N";
            String nah = "n";
            String invalidV = "\n************************\nDebes introducir un caracter valido:\nSi = \"S\", \"s\"\nNo = \"N\", \"n\"\n*************************\n";
            boolean play = false;
            boolean test = true;
            System.out.print("En este juego tendrás que adivinar un número \naleatorio del 0-20\n");
            while (test == true) {
                System.out.print("¿Deseas comenzar una partida? \"[S]i\", \"[N]o\"\n");
                Scanner pa = new Scanner(System.in);
                pag = pa.nextLine();
                if (pag.equals(yes) || pag.equals(yeah)) {
                    test = false;
                    play = true;
                } else if (pag.equals(not) || pag.equals(nah)) {
                    test = false;
                    System.out.print("¡Adiós!");
                } else {
                    test = true;
                    System.out.print(invalidV);
                }
            }
            while (play == true) {
                Random an = new Random();
                int numeroAleatorio = an.nextInt(20);
                int intentos = 0;
                Scanner in = new Scanner(System.in);
                Double adivina;
                boolean correcto = false;

                while (correcto == false) {

                    System.out.print("Adivina un número del 0-20: ");
                    adivina = in.nextDouble();
                    intentos++;

                    if (adivina == numeroAleatorio) {
                        correcto = true;
                    } else if (adivina < numeroAleatorio) {
                        System.out.print("¡Intenta con un número mas grande!\n");
                    } else if (adivina > numeroAleatorio) {
                        System.out.print("¡Intenta con un número mas pequeño\n");
                    } else if (!Character.isDigit(adivina)) {
                    }

                }
                System.out.print("\n¡GANASTE!");
                System.out.print("\nEl número era " + numeroAleatorio);
                System.out.print("\nTe tomó " + intentos + " intentos\n");
                test = true;

                while (test == true) {
                    System.out.print("\n\n¿Deseas comenzar una nueva partida? \"[S]i\", \"[N]o\"\n");
                    play = false;
                    Scanner pai = new Scanner(System.in);
                    pag = pai.nextLine();
                    if (pag.equals(yes) || pag.equals(yeah)) {
                        play = true;
                        test = false;
                    } else if (pag.equals(not) || pag.equals(nah)) {
                        System.out.print("¡Gracias por jugar!\n¡Vuelve pronto!");
                        test = false;
                    } else {
                        System.out.print(invalidV);
                        test = true;
                    }
                }
                in.close();
            }
        } catch (Exception e) {
            System.out.print("Error, has introducido un caracter inválido, intenta ingresando solo números");
        }
    }
}
