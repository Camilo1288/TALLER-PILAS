/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio05;
import java.util.Stack;
/**
 *
 * @author Usuario
 */
public class Pila {
    private Stack<Character> pila;

    public Pila() {
        pila = new Stack<>();
    }

    public void push(char c) {
        pila.push(c);
    }

    public char pop() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return '\0';
    }

    public char peek() {
        if (!pila.isEmpty()) {
            return pila.peek();
        }
        return '\0';
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }
}
