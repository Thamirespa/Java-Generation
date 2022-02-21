package br.com.generation.exerciciosaula01;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio6Sequencial {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	double x1, x2, y1, y2; 
	double f;
	double d;
	
	System.out.println("Digite o valor de x1: ");
	x1 = sc.nextDouble();
	System.out.println("Digite o valor de x2: ");
	x2 = sc.nextDouble();
	System.out.println("Digite o valor de y1: ");
	y1 = sc.nextDouble();
	System.out.println("Digite o valor de y2: ");
	y2 = sc.nextDouble();
	
	f = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 2);
	
	//d = Math.sqrt(f,2);
	sc.close();
	}
}
