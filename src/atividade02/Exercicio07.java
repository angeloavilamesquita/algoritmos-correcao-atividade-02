package atividade02;

import java.util.Scanner;

/**
 * O índice de massa corporea (IMC) de uma pessoa é igual ao seu
 * pelo (em kgs) dividido pelo quadrado de sua altura (em metros).
 * Dados peso e altura de uma pessoa, informe o valor de seu IMC. 
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o peso (em kgs): ");
        double weight = read.nextDouble();
        System.out.print("Digite a altura (em metros): ");
        double height = read.nextDouble();
        double imc = weight / Math.pow(height, 2);
        System.out.println("o IMC eh: " + imc); 
    }
}
