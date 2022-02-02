package br.com.generation.colletions3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaExercicio3Colletions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Exercicio3Colletions>estoque = new ArrayList<>();
		System.out.println("Quantos produtos você deseja registar: ");
		
		int numeroProdutos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < numeroProdutos; i++) {
			
			System.out.println("Qual o produto: ");
			String produto = sc.next();
			sc.nextLine();
			
			System.out.println("Quantas unidades:  ");
			int quantidade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("qual o preço unitário do produto? ");
			double preco = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("qual o código do produto? ");
			String codigo = sc.next();
			sc.nextLine();
			
			estoque.add(new Exercicio3Colletions(produto, quantidade, preco, codigo));
					
		}	

		for(Exercicio3Colletions i: estoque) {
			System.out.println(i);
			}
		    }
		
	
		}	

