package atividade02;

import java.util.Scanner;

/**
 * Dado um número real qualquer, informe qual é o seu dobro;
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero real: ");
        double number = read.nextDouble();
        double result = number * 2;
        System.out.println("O resultado eh: " + result);
    }
    
}