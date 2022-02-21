package br.com.generation.exerciciosaula01;

import java.util.Scanner;
public class Exercicio5Sequencial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, media;
		
		System.out.println("Digite o valor de N1");
		n1 = sc.nextDouble();
		System.out.println("Digite o valor de N2");
		n2 = sc.nextDouble();
		System.out.println("Digite o valor de N3");
		n3 = sc.nextDouble();
		
		media = ((n1*2) +(n2*3) + (n3 *5)) / (2+3+5);
		
		System.out.println("A média ponderada é: " + media);

		sc.close();
	}

}
