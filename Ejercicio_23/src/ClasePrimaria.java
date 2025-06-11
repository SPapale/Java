import java.util.Scanner; 
public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		String [] palabras = {"Disco", "Musica", "Taza", "Argentina", "Melbas"};
		String buscar = ""; 
		
		boolean encontrada = false; 
		
		System.out.println("Ingrese la palabra que quiere buscar: ");
		buscar = scanner.nextLine(); 
		
		for(String palabra : palabras) {
			if(palabra.equals(buscar)) {
				encontrada = true; 
			}
		}
		if(encontrada) {
			System.out.println("La palabra esta en el array");
		}
		else {
			System.out.println("La palabra no esta en el array");
		}
		
	}

}
