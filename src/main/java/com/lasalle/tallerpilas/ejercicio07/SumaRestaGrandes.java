/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio07;
import java.util.Stack;
/**
 *
 * @author Usuario
 */
public class SumaRestaGrandes {
    public static Stack<Integer> convertirAPila(String numeroStr) {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < numeroStr.length(); i++) {
            char c = numeroStr.charAt(i);
            if (Character.isDigit(c)) {
                pila.push(Character.getNumericValue(c));
            }
        }
        return pila;
    }
    public static String sumarPilas(Stack<Integer> p1, Stack<Integer> p2) {
        Stack<Integer> resultado = new Stack<>();
        int acarreo = 0;

        while (!p1.isEmpty() || !p2.isEmpty() || acarreo > 0) {
            int suma = acarreo;
            
            if (!p1.isEmpty()) {
                suma += p1.pop();
            }
            
            if (!p2.isEmpty()) {
                suma += p2.pop();
            }
            
            acarreo = suma / 10;
            resultado.push(suma % 10);
        }

        // Construir el string final del resultado
        StringBuilder sb = new StringBuilder();
        while (!resultado.isEmpty()) {
            sb.append(resultado.pop());
        }
        return sb.toString();
    }
}
