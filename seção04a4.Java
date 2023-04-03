// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

package udemy;
import java.util.Scanner;

public class seção04a4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o número do funcionário? ");
		int n = sc.nextInt();
		
		System.out.print("Número de hora trabalhada desse funcionário: ");
		int h = sc.nextInt();
		
		System.out.print("Salário recebido por hora: ");
		double s = sc.nextDouble();
		
		double salario = h * s;
		
		System.out.println("Numero: " + n);
		System.out.printf("Salário: R$ %.2f%n", salario);
		
		
		

	}

}
