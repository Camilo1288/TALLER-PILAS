/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio02;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Palindromo p = new Palindromo();
        System.out.println(p.limpiar("Isaac no ronca así"));
    
    Pila pila = p.llenarPila("abc");
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }
}
