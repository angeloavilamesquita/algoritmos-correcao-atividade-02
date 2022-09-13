package atividade02;

import java.util.Scanner;

/**
 * Dado o total de vendas de um vendedor, calcule a sua comissão. 
 * Suponha que a comissão do vendedor seja de 10% do total de vendas.
 */
public class Exercicio02 {
    
    final static double PERCENTUAL_COMMISSION = 0.10;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o total de vendas do vendedor: ");
        double totalSales = read.nextDouble();
        double commission = totalSales * PERCENTUAL_COMMISSION;
        System.out.println("A comissao do vendedor eh: " + commission); 
    }
    
}
