import java.util.Scanner; 
public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Ingrese una palabra o frase: ");
		
		String frase = scanner.nextLine(); 
		
		String invertido = ""; 
		
		for(int i = frase.length() - 1; i >=0; i--) {
			invertido = invertido + frase.charAt(i); 
		}
		
		System.out.println("Palabra o frase invertida: " + invertido); 
	}

}
