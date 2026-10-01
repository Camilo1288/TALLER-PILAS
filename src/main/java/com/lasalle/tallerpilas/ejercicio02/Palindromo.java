/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio02;
 import java.text.Normalizer;
/**
 *
 * @author Usuario
 */
public class Palindromo {
     public String limpiar(String frase) {
         frase = Normalizer.normalize(frase, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (Character.isLetter(letra)) {
                resultado = resultado + Character.toLowerCase(letra);
            }
        }
        return resultado;
    }
      public Pila llenarPila(String limpia) {
        Pila pila = new Pila();
        for (int i = 0; i < limpia.length(); i++) {
            char letra = limpia.charAt(i);
            pila.push(letra);
        }
        return pila;
    }
      public boolean esPalindromo(String frase) {
        String limpia = limpiar(frase);
        Pila pila = llenarPila(limpia);
        for (int i = 0; i < limpia.length(); i++) {
            char original = limpia.charAt(i);
            char alReves = pila.pop();
            if (original != alReves) {
                return false;
            }
        }
        return true;
    }
}
