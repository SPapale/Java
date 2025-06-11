import java.util.Scanner; 
public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		
		
		System.out.println("Ingrese un numero x: ");
		int x = scanner.nextInt();
		
		int contador = 0;
		
		for(int numero: numeros) {
			if(numero > x) {
				contador++; 
			}
		}
		
		System.out.println("La cantidad de elementos mayores a " + x + " son " + contador);
	}

}
