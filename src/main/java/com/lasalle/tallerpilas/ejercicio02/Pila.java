/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio02;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Pila {
    private ArrayList<Character> elementos = new ArrayList<>();
    
    public void push(char c) {
         elementos.add(c);
    }
     public char pop() {
        char letra = elementos.remove(elementos.size() - 1);
        return letra;
    }
     public char peek() {
        return elementos.get(elementos.size() - 1);
    }
     public boolean isEmpty() {
        return elementos.isEmpty();
    }
}
