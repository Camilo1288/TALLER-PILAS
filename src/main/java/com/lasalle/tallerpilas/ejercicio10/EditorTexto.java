/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio10;
import java.util.Stack;
/**
 *
 * @author Usuario
 */
public class EditorTexto {
   public static String editarLinea(String texto) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == '-') {
                // Borra el último carácter introducido
                if (!pila.isEmpty()) {
                    pila.pop();
                }
            } else if (c == '$') {
                // Borra desde donde se está hasta el final de la línea (vacía la pila)
                pila.clear();
            } else {
                pila.push(c);
            }
        }

        StringBuilder resultado = new StringBuilder();
        while (!pila.isEmpty()) {
            resultado.insert(0, pila.pop());
        }
        return resultado.toString();
    }
}
