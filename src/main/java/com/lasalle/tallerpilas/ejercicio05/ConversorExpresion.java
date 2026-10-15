/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.tallerpilas.ejercicio05;

/**
 *
 * @author Usuario
 */
public class ConversorExpresion {
    private static int prioridad(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    public static String infijoAPostfijo(String expresionInfija) {
        StringBuilder salida = new StringBuilder();
        Pila pila = new Pila();

        for (int i = 0; i < expresionInfija.length(); i++) {
            char c = expresionInfija.charAt(i);

            
            if (c == ' ') {
                continue;
            }

            
            if (Character.isLetterOrDigit(c)) {
                salida.append(c);
            } 
            
            else if (c == '(') {
                pila.push(c);
            } 
            
            else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    salida.append(pila.pop());
                }
                pila.pop(); 
            } 
            
            else {
                while (!pila.isEmpty() && prioridad(c) <= prioridad(pila.peek())) {
                    salida.append(pila.pop());
                }
                pila.push(c);
            }
        }

        
        while (!pila.isEmpty()) {
            salida.append(pila.pop());
        }

        return salida.toString();
    }

    public static void main(String[] args) {
        String infija = "A + B * C - D";
        String postfija = infijoAPostfijo(infija);
        
        System.out.println("Expresión Infija: " + infija);
        System.out.println("Expresión Postfija: " + postfija);
    }
}
