/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package br.com.generation.exerciciosaula01;
import java.util.Scanner;
//import java.lang.Math;

public class Exercicio4Decisao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o n�mero: ");
		
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			
			num = (int) Math.sqrt(num);
			System.out.println("O n�mero � par e a ra�z quadrada �: " + num);
		}else {
			
			num = (int)Math.pow(num, 2);
			System.out.println("O n�mero � �mpar e a pot�ncia �: " + num);
		}
		
		sc.close();
		
	}

}
