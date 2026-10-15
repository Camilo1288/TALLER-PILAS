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
    public void mostrarRepisas() {
        System.out.println("Repisa 1 (fondo -> tope): " + repisa1);
        System.out.println("Repisa 2 (fondo -> tope): " + repisa2);
        System.out.println("Repisa 3: " + repisa3);
    }
    public void ordenar() {
        while (!repisa1.isEmpty()) {
            insertarOrdenado(repisa1.pop());
        }
        while (!repisa2.isEmpty()) {
            insertarOrdenado(repisa2.pop());
        }
    }

    private void insertarOrdenado(int tomo) {
        int i = 0;
        while (i < repisa3.size() && repisa3.get(i) < tomo) {
            i++;
        }
        repisa3.add(i, tomo);
    }
}
