package atividade02;

import java.util.Scanner;

/**
 * Dadas as medidas de uma sala em metros 
 * (comprimento e largura), 
 * informe a sua área em metros quadrados.
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o comprimento em metros: ");
        double length = read.nextDouble();
        System.out.print("Digite a largura em metros: ");
        double width = read.nextDouble();
        double area = length * width;
        System.out.println("A area da sala eh: " + area); 
    }
    
}
