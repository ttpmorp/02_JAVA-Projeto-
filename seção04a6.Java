// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
// mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.

package udemy;

import java.util.Scanner;  //importei Scanner para ler os valores de entrada digitados pelo usuário. 

public class seção04a6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double tri, cir, tra, qua, ret; // declaro as variáveis: triangulo, circulo, trapezio, quadrado e retangulo
		double pi = 3.14159; // declaro uma variável em pi
		
		
		// Entrada e leitura de dados
		System.out.print("Digite o valor de A: "); // Entrada
		double A = sc.nextDouble(); // Leitura 
		
		System.out.print("Digite o valor de B: ");
		double B = sc.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		double C = sc.nextDouble();
		
		
		
		// As fórmulas para calcular a área do triângulo retângulo, a área do círculo, a área do trapézio, 
		// a área do quadrado e a área do retângulo são aplicadas a essas variáveis.
		 tri = (A * C) / 2;
		cir = pi * Math.pow(C, 2.0);
		tra = ((A + B) * C) / 2;
		qua = Math.pow(B, 2.0);
		ret = A * B;
		
		
		
		// Saída de dados
		System.out.printf("Triângulo: %.3f%n", tri); 
		System.out.printf("Circulo: %.3f%n", cir);
		System.out.printf("Trapezio: %.3f%n", tra);
		System.out.printf("Quadrado: %.3f%n", qua);
		System.out.printf("Retângulo: %.3f%n", ret);
		
		
		

	}

}
