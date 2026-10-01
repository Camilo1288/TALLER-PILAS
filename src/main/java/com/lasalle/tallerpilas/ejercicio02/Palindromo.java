/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio02;

/**
 *
 * @author Usuario
 */
public class Palindromo {
     public String limpiar(String frase) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (Character.isLetter(letra)) {
                resultado = resultado + Character.toLowerCase(letra);
            }
        }
        return resultado;
    }
}
