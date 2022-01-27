package br.com.generation.exerciciosaula01;
import java.util.Scanner;
public class Exxercicio8Sequencial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double custoFabrica, p1, p2, custoTotal;
		
		System.out.println("Digite o valor do custo de fábrica: ");
		custoFabrica = sc.nextDouble();
		
		custoTotal = custoFabrica + (custoFabrica*0.28) + (custoFabrica * 0.45);
		
		System.out.println("O custo total do automóvel é: " + custoTotal);
		
		
				
	}

}
