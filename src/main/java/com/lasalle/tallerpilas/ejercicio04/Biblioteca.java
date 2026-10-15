/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio04;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Usuario
 */
public class Biblioteca {
    private final Pila<Integer> repisa1 = new Pila<>();
    private final Pila<Integer> repisa2 = new Pila<>();
    private final ArrayList<Integer> repisa3 = new ArrayList<>();

    public void llenarRepisas(int m, int n) {
        ArrayList<Integer> tomos = new ArrayList<>();
        for (int i = 1; i <= m + n; i++) {
            tomos.add(i);
        }
        Collections.shuffle(tomos); // tomos desordenados

        for (int i = 0; i < tomos.size(); i++) {
            if (i < m) {
                repisa1.push(tomos.get(i));
            } else {
                repisa2.push(tomos.get(i));
            }
        }
    }
}
