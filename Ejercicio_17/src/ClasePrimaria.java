import java.util.Scanner; 
public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Ingrese una frase: ");
		String frase = scanner.nextLine(); 
	 
		int cantPalabra = cantPalabra(frase);
		System.out.println("La cantidad de palabras que hay en tu frase es: " + cantPalabra);
		
		
		
	}
	
	public static int cantPalabra(String frase) {
		
		String[] palabra = frase.split(" "); 
		return palabra.length; 
	}	

}
