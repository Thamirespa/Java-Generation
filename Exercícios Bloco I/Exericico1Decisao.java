/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

package br.com.generation.exerciciosaula01;

import java.util.Scanner;
public class Exericico1Decisao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int num1, num2, num3, maior = 0;
	System.out.println("Digite a sequencia de tr�s n�meros");
	 num1 = sc.nextInt();
	 num2 = sc.nextInt();
	 num3 = sc.nextInt();
	 
	 if (num1 > num2 && num1 > num3) {
		 maior = num1;
	 }else if ( num2 > num1 && num2 > num3) {
		 maior = num2;
	 }else {
		 maior = num3;
	 }
	 System.out.println("O maior n�mero �: " + maior);
	sc.close();
	
	}

}
