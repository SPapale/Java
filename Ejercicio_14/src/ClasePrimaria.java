import java.util.Scanner; 
public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		int cantidad, a=0, b=1, siguiente; 
		
		System.out.println("Ingrese la cantidad de numeros para la secuencia: ");
		cantidad = scanner.nextInt();
		
		System.out.println("Los primeros " + cantidad + " numeros de la secuencia son: ");
		for(int i=0; i<cantidad; i++) {
			System.out.print(a + " "); 
			siguiente = a + b; 
			a = b; 
			b = siguiente; 
		}
		
	}

}
