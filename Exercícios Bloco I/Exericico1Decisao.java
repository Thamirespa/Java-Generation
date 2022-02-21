/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package br.com.generation.exerciciosaula01;

import java.util.Scanner;
public class Exericico1Decisao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int num1, num2, num3, maior = 0;
	System.out.println("Digite a sequencia de três números");
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
	 System.out.println("O maior número é: " + maior);
	sc.close();
	
	}

}
