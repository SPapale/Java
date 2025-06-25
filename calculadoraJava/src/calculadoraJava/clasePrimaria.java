package calculadoraJava;
import java.util.Scanner; 
public class clasePrimaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		int a=0,b=0, op = 0, r=0; 
		System.out.println("Introduce un numero: "); 
		a= scanner.nextInt(); 
		System.out.println("Introduce un numero: "); 
		b = scanner.nextInt(); 
		switch(op) {
		case 1: 
			r = a +b; 
			break; 
		case 2: 
			r = a - b; 
			break; 
		case 3: 
			r = a * b; 
			break; 
		case 4: 
			r = a/b; 
			break; 
		}
	}

}
