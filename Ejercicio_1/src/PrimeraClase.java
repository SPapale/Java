import java.util.Scanner;

public class PrimeraClase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i < 4; i++) {
			System.out.print("Ingrese un numero ");
			i = scanner.nextInt();
			if(i % 2 == 0) {
				System.out.println("Par ");
			}
			else {
				System.out.println(+ i);
			}
		}
		scanner.close();
	}

}
