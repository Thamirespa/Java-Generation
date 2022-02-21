package br.com.generation.exerciciosaula01;

import java.util.Scanner;
public class Exercicio1Sequencial {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	int ano, mes, dia, totalDias;
	
	System.out.println("Escreva o ano do seu nascimento: [com quatro digítos] ");
	
	ano = sc.nextInt();
	
	System.out.println("Escreva o mês do seu nascimento: [com dois digítos] \n");
	 mes = sc.nextInt();
	 
	System.out.println("Escreva o dia do seu nascimento: [com dois digítos] \n");
	
	dia = sc.nextInt();
	
	totalDias = ((2022 - ano)*365) + ((12-mes-11)*30) + ((-1) * (dia - 26));
	
	System.out.println("A sua idade em dias é: " + totalDias);
	
	sc.close();
	}
	
	}


