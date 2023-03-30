// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159

package udemy;

import java.util.Locale;
import java.util.Scanner;

public class seção04a2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.print("Digite o valor do raio de um círculo: ");
		Double raio_de_um_circulo = sc.nextDouble();
		
		double pi = 3.14159;
		double area = Math.pow(raio_de_um_circulo, 2.0);
		
		System.out.printf("O valor do raio desse círculo é: %.4f%n", pi * area);
		
		

	}

}
