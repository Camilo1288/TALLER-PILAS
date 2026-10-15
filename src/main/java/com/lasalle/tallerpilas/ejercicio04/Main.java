/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio04;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tomos en la repisa 1 (m): ");
        int m = sc.nextInt();
        System.out.print("Tomos en la repisa 2 (n): ");
        int n = sc.nextInt();

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.llenarRepisas(m, n);

        System.out.println("\n--- Antes de ordenar ---");
        biblioteca.mostrarRepisas();

        biblioteca.ordenar();

        System.out.println("\n--- Despues de ordenar ---");
        biblioteca.mostrarRepisas();
    }
}
