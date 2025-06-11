import java.util.Scanner; 
public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Ingrese 1. Para convertir fahrenheit a celsius o 2. Para celsius a fahrenheit");
		int opcion = scanner.nextInt(); 
		switch(opcion) {
		case 1: 
			System.out.println("Ingrese el grado: "); 
			int grado = scanner.nextInt(); 
			int celsius = (grado - 32) * 5/9; 
			System.out.println("El grado  " + grado + " en fahrenheit a celsius es " + celsius);
			break;
		case 2: 
			System.out.println("Ingrese el grado: "); 
			grado = scanner.nextInt(); 
			int fahrengheit = (grado * 9/5) + 32; 
			System.out.println("El grado " + grado + " en celsius a fahrengheit es " + fahrengheit);
			break;
		}
		
	}

}
