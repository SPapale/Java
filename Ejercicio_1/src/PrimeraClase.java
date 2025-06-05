import java.util.Scanner;

public class PrimeraClase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		for(int i = 1; i <= 3; i++) {
			System.out.print("Ingrese un numero ");
			numero = scanner.nextInt();
			if(numero % 2 == 0) {
				System.out.println("Par ");
			}
			else {
				System.out.println(+ numero);
			}
		}
		scanner.close();
	}

}
