package br.com.generation.exerciciosaula01;

import java.util.Scanner;
public class Exercicio1Sequencial {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	int ano, mes, dia, totalDias;
	
	System.out.println("Escreva o ano do seu nascimento: [com quatro dig�tos] ");
	
	ano = sc.nextInt();
	
	System.out.println("Escreva o m�s do seu nascimento: [com dois dig�tos] \n");
	 mes = sc.nextInt();
	 
	System.out.println("Escreva o dia do seu nascimento: [com dois dig�tos] \n");
	
	dia = sc.nextInt();
	
	totalDias = ((2022 - ano)*365) + ((12-mes-11)*30) + ((-1) * (dia - 26));
	
	System.out.println("A sua idade em dias �: " + totalDias);
	
	sc.close();
	}
	
	}


