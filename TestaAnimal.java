package br.com.generation.herenca;

import java.util.Scanner;

public class TestaAnimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		System.out.println("Digite os dados sobre o cachorro:");
		String nome = sc.next();
		int idade = sc.nextInt();
		String som = sc.next();
		String situacao = sc.next();
		System.out.println();
		
		System.out.println("Digite os dados sobre o cavalo:");
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String som1 = sc.next();
		String situacao1 = sc.next();
		System.out.println();
		
		System.out.println("Digite os dados sobre a preguiça:");
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		String som2 = sc.next();
		String situacao2 = sc.next();
		System.out.println();
		
		
		cachorro1.setNome(nome);
		cachorro1.setIdade(idade);
		cachorro1.setSom(som);
		cachorro1.setCorrer(situacao);
		
		cavalo1.setNome(nome1);
		cavalo1.setIdade(idade1);
		cavalo1.setSom(som1);
		cavalo1.setCorrer(situacao1);
		
		preguica1.setNome(nome2);
		preguica1.setIdade(idade2);
		preguica1.setSom(som2);
		preguica1.setSubirEmArvores(situacao2);

		System.out.println();
		
		System.out.println(" O nome do cachorro é: " + cachorro1.getNome());
		System.out.println(" A idade do cachorro é: " + cachorro1.getIdade());
		System.out.println(" O cachorro emite o seguinte som: " + cachorro1.getSom());
		System.out.println(" O cachorro está " + cachorro1.getCorrer());
		
		System.out.println();
		
		System.out.println(" O nome do cavalo é: " + cavalo1.getNome());
		System.out.println(" A idade do cavalo é: " + cavalo1.getIdade());
		System.out.println(" O cavalo emite o seguinte som: " + cavalo1.getSom());
		System.out.println(" O cavalo está " + cavalo1.getCorrer());
		
		System.out.println();
		
		System.out.println(" O nome da preguiça é: " + preguica1.getNome());
		System.out.println(" A idade da preguiça é: " + preguica1.getIdade());
		System.out.println(" A preguiça emite o seguinte som: " + preguica1.getSom());
		System.out.println(" A preguça está " + preguica1.getSubirEmArvores());
		
		
		
			

	}

}
