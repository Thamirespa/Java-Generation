/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package br.com.generation.exerciciosaula01;
import java.util.Scanner;
//import java.lang.Math;

public class Exercicio4Decisao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o número: ");
		
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			
			num = (int) Math.sqrt(num);
			System.out.println("O número é par e a raíz quadrada é: " + num);
		}else {
			
			num = (int)Math.pow(num, 2);
			System.out.println("O número é ímpar e a potência é: " + num);
		}
		
		sc.close();
		
	}

}
