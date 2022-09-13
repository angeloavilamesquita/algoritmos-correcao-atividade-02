package atividade02;

import java.util.Scanner;

/**
 * Dados valor da compra e o percentual de desconto.
 * Calcule o valor a ser pago. Considere que o percentual
 * de desconto é um número real entre 0 e 1.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double totalSale = read.nextDouble();
        System.out.print("Digite o percentual de desconto: ");
        double discountPercentage = read.nextDouble();
        boolean isPercentageValid = discountPercentage >= 0 && discountPercentage <= 1;
        if (!isPercentageValid) {
            System.out.println("o valor do desconto deverá ser entre 0 e 1"); 
        } else {
            double discount = totalSale * discountPercentage;        
            double totalValue = totalSale - discount;
            System.out.println("o valor a ser pago eh: " + totalValue); 
        }
    }
    
}
