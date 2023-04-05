// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

package udemy;
import java.util.Scanner;

public class seção04a5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Qual o código do objeto 1: ");
		int cod1 = sc.nextInt();
		System.out.print("Digite quantos produtos 1 você vai querer: ");
		int prod1 = sc.nextInt();
		System.out.print("Digite o valor do produto 1: ");
		double valor1 = sc.nextDouble();
		
		System.out.print("Qual o código do objeto 2: ");
		int cod2 = sc.nextInt();
		System.out.print("Digite quantos produtos 2 você vai querer: ");
		int prod2 = sc.nextInt();
		System.out.print("Digite o valor do produto 2: ");
		double valor2 = sc.nextDouble();
		
		
		double vl = (prod1 * valor1) + (prod2 * valor2);
		
		System.out.printf("Valor a pagar do produto " + cod1 + " e " + cod2 + ": R$ %.2f%n", vl);
	

	}

}
