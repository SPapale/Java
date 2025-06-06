import java.util.Scanner;
public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
			System.out.println("Ingrese un numero del 1 al 10");
			numero = scanner.nextInt();
			
			for(int i = 1; i<= 10; i++) {
				int multiplicar = numero * i;
				System.out.println(numero + "x" + i + "=" + multiplicar);
			}
			scanner.close();
		}
		
	}


