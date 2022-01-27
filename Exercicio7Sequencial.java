package br.com.generation.exerciciosaula01;
import java.util.Scanner;
public class Exercicio7Sequencial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C, D, E, F, X, Y;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de b: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		System.out.println("Digite o valor de D: ");
		D = sc.nextDouble();
		System.out.println("Digite o valor de E: ");
		E = sc.nextDouble();
		System.out.println("Digite o valor de F: ");
		F = sc.nextDouble();
		
		X = (C*E)-(B*F) / (A*E)-(B*D);
		Y = (A*F)-(C*D) / (A*E)-(B*D);
		
		System.out.println("Os valores de X e Y são, respectivamente: " + X + " , " + Y);

	
}
}
