/ Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos. Com entrada e saída;

package udemy;

import java.util.Scanner;

public class seção04a01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	
		
		System.out.println("Digite dois números: ");
		System.out.print("Número 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Número 2: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("A soma dos dois números é: " + soma);
		
		
	}

}
