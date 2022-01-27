package br.com.generation.exerciciosaula01;
import java.util.Scanner;
public class Exercicio3Sequencial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	double S, segTotal, H, M;
	
	System.out.println("Digite a quantidade total de segundos");
	
	segTotal = sc.nextDouble();
	
	H = segTotal/3600;
	M = (segTotal - (H*3600)) / 60;
	S = segTotal % 60;
	
	System.out.println(H + ":" + M + ":" + S);
		
		sc.close();		
	}
	
	
	
	

}
