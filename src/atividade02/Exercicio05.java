package atividade02;

import java.util.Scanner;

/**
 * Dados um valor em real e a cotação do dólar,
 * converta esse valor em dólares.
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor em R$: ");
        double brl = read.nextDouble();
        System.out.print("Digite a cotação do dólar: ");
        double price = read.nextDouble();
        double usd = brl * price;
        System.out.println("O valor em USD eh: " + usd); 
    }
    
}
