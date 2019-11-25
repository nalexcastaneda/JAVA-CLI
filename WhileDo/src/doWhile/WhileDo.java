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
        int rnge = 0;
        String level = null;
        String pag = null;
        String yes = "S";
        String yeah = "s";
        String not = "N";
        String nah = "n";
        String invalidV = "\n************************\nDebes introducir un caracter valido:\nSi = \"S\", \"s\"\nNo = \"N\", \"n\"\n*************************\n";
        boolean play = false;
        boolean test = true;
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
            } else if (pag.equals("Salir") || pag.equals("salir")) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else {
                test = true;
                System.out.print(invalidV);
            }
        }
        boolean selected = false;
        while (selected == false) {
            Scanner lvl = new Scanner(System.in);
            System.out
                    .print("Elige un nivel de difícultad\n[F]acil, [M]edio, [D]ificil, [E]xtremo, [P]ersonalizado:\n");
            level = lvl.nextLine();
            if (level.equals("F") || level.equals("f")) {
                rnge = 20;
                selected = true;
            } else if (level.equals("M") || level.equals("m")) {
                rnge = 40;
                selected = true;
            } else if (level.equals("D") || level.equals("d")) {
                rnge = 100;
                selected = true;
            } else if (level.equals("E") || level.equals("e")) {
                rnge = 500;
                selected = true;
            } else if (level.equals("P") || level.equals("p")) {
                int mylvl = 0;
                Scanner ilvl = new Scanner(System.in);
                System.out.print("Introuce tu rango personalizado:\n1-");
                while (!ilvl.hasNextInt()) {
                    ilvl.next();
                    System.out.println(
                            "Ingresar un rango válido.\nEl rango siempre iniciará con 1.\nDebes ingresar un número limite\nEjemplo: \"200\"\nIntenta nuevamente: 1-");
                }
                rnge = ilvl.nextInt();
                selected = true;
            } else if (level.equals("Salir") || level.equals("salir")) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else {
                System.out.print(
                        "Introduce un nivel válido:\nFacil = \"F\", \"f\"\nMedio = \"M\", \"m\"\nDifícil = \"D\", \"d\"\nExtremo = \"E\", \"e\"\n\n");
                selected = false;
            }
        }
        while (play == true) {
            System.out.print("En este juego tendrás que adivinar un número aleatorio del 1-" + rnge + "\n");
            Random an = new Random();
            int numeroAleatorio = (an.nextInt(rnge) + 1);
            int intentos = 0;
            boolean correcto = false;

            while (correcto == false) {
                Scanner in = new Scanner(System.in);
                int adivina;
                System.out.print("Adivina un número del 1-" + rnge + ": ");
                while (!in.hasNextInt()) {
                    in.next();
                    System.out.print("Solo se pueden ingresar numeros. Inténtalo de nuevo: ");
                }
                adivina = in.nextInt();
                intentos++;
                while (adivina > rnge || adivina < 1) {
                    System.out.print(
                            "El número está fuera de rango.\nAsegurate de que el número sea mayor que 0 y menor que "
                                    + rnge + ".\nIntenta nuevamente: ");
                    Scanner inp = new Scanner(System.in);
                    while (!inp.hasNextInt()) {
                        inp.next();
                        System.out.print("Solo se pueden ingresar numeros. Inténtalo de nuevo: ");
                    }
                    adivina = inp.nextInt();
                }
                if (adivina == numeroAleatorio) {
                    System.out.print("\n¡GANASTE!");
                    System.out.print("\nEl número era " + numeroAleatorio);
                    System.out.print("\nTe tomó " + intentos + " intentos\n");
                    test = true;
                    correcto = true;
                } else if (adivina < numeroAleatorio) {
                    System.out.print("¡Intenta con un número mas grande!\n");
                } else if (adivina > numeroAleatorio) {
                    System.out.print("¡Intenta con un número mas pequeño\n");
                }
                while (test == true) {
                    System.out.print("\n\n¿Deseas comenzar una nueva partida? \"[S]i\", \"[N]o\"\n");
                    play = false;
                    Scanner pai = new Scanner(System.in);
                    pag = pai.nextLine();
                    if (pag.equals(yes) || pag.equals(yeah)) {
                        play = true;
                        test = false;
                        selected = false;
                    } else if (pag.equals(not) || pag.equals(nah)) {
                        System.out.print("¡Gracias por jugar!\n¡Vuelve pronto!");
                        test = false;
                    } else if (pag.equals("Salir") || pag.equals("salir")) {
                        System.out.println("Saliendo...");
                        System.exit(0);
                    } else {
                        System.out.print(invalidV);
                        test = true;
                    }
                }
            }
        }
    }
}