/*Faça um programa que entre com três números e coloque em ordem crescente.*/

package br.com.generation.exerciciosaula01;
import java.util.Scanner;
public class Exercicio2Decisao {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num1, num2, num3, pri, seg=0, ter=0;
	
	System.out.println("Digite os três números: ");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
	pri = num1;
// primeiro	
	if(num2 < pri) {
		pri = num2;
	}else if (num3 < pri ) {
		pri = num3;
	}
// segundo		
	
	if(num1 > pri) {
		seg = num1;
	}else {
		seg = num2;
	
		if(num3< seg) {
			seg = num3;
		} 
	} 
// terceiro	
	
	if(num1 > seg) {
	ter =  num1;
	
}else {
	if(num2 > seg) {
		ter = num2;
	}else {
		ter = num3;	
	}
}
	System.out.println(pri);
	System.out.println(seg);
	System.out.println(ter);
}
}
