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
}
