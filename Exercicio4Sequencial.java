package br.com.generation.exerciciosaula01;
import java.util.Scanner;
import java.lang.Math;
public class Exercicio4Sequencial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, D, R, S;
		
		System.out.println("Digite o valor de A:");
		A = sc.nextDouble();
		
		System.out.println("Digite o valor de B:");
		B = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		
		D = (R + S) / 2;
		
		System.out.println("O valor da expressão vale: " + D);
		
		
		sc.close();
	}

}
