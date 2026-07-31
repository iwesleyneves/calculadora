import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	int valor1, valor2;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Informe o 1o valor: ");
	valor1 = scanner.nextInt();
	
	System.out.print("\nInforme o 2o valor: ");
	valor2 = scanner.nextInt();
	
	System.out.println("Soma: "+(valor1 + valor2));
	System.out.println("Dif.: "+(valor1 - valor2));
	System.out.println("Multiplicação: "+(valor1 * valor2));
	System.out.println("Divisão: "+(valor1 / valor2));
	}
}
