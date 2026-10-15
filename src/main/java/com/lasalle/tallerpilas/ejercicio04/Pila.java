/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio04;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Pila<T> {
     private final ArrayList<T> elementos = new ArrayList<>();

    public void push(T dato) {
        elementos.add(dato);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }
}
