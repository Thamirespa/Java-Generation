package br.com.generation.exerciciosaula01;
import java.util.Scanner;

public class Exercicio2Sequencial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dias, meses, anos;
		
		System.out.println("Digite a sua idade: ");
		dias = sc.nextInt();
		
		anos = dias /365;
		meses = (dias%365)/30;
		dias = (dias % 365) % 30;
		
		System.out.println("A sua idade em anos é: " + anos + " anos " + meses + " meses " + dias + " dias ");
	}

}
