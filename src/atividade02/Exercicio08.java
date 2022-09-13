package atividade02;

import java.util.Scanner;

/**
 * Dados um capital C, uma taxa de juros mensal fixa J e um
 * periodo de aplicação em meses M, informe o montante F no
 * final do período (F = C * (1 + J/100)elevado M)
 */
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o capital: ");
        double capital = read.nextDouble();
        System.out.print("Digite a taxa de juros: ");
        double fees = read.nextDouble();
        System.out.print("Digite o periodo: ");
        int months = read.nextInt();
        double amount = capital * Math.pow(1 + fees/100, months);
        System.out.println("o montante eh: " + amount); 
    }
}
