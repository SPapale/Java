import java.util.Scanner; 
public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Ingrese un numero:  ");
		
		int numero = scanner.nextInt(); 
		
		int factorial = 1;
		
		for(int i = 1; i <=numero; i++) {
			factorial  = factorial * i; 
		}

		System.out.println("El factorial del numero " + numero + "es " + factorial); 
	}

}
