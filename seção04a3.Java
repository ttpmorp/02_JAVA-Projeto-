// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package udemy;

import java.util.Scanner;

public class seção04a3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite os números: ");
		
		System.out.print("Digite um número : ");
		int A = sc.nextInt();
		
		System.out.print("Digite um número : ");
		int B = sc.nextInt();
		
		System.out.print("Digite um número : ");
		int C = sc.nextInt();
		
		System.out.print("Digite um número : ");
		int D = sc.nextInt();
		
		
		int diferenca = (A * B - C * D);
		
		
		
		System.out.println("A diferença é: " + diferenca);
		

	}

}
