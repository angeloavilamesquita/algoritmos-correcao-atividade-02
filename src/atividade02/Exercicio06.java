package atividade02;

import java.util.Scanner;

/**
 * Dadas as medidas de uma sala em metros (comprimento e largura)
 * bem como o preço do metro quadrado de carpete, informe o custo
 * total para forrar o piso da sala
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o comprimento em metros: ");
        double length = read.nextDouble();
        System.out.print("Digite a largura em metros: ");
        double width = read.nextDouble();
        System.out.print("Digite o preço do metro quadrado do carpete: ");
        double price = read.nextDouble();
        double area = length * width;
        double totalValue = price * area;
        System.out.println("o valor para forrar o piso eh: " + totalValue); 
    }
    
}
