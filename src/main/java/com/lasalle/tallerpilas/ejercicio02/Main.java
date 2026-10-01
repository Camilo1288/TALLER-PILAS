/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio02;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Palindromo p = new Palindromo();
        String otra;

        do {
            System.out.print("Escribe una frase: ");
            String frase = teclado.nextLine();

            if (p.esPalindromo(frase)) {
                System.out.println("Es palíndromo");
            } else {
                System.out.println("No es palíndromo");
            }

            System.out.print("Otra vez (s/n)? ");
            otra = teclado.nextLine();
        } while (otra.equalsIgnoreCase("s"));
    }
}
