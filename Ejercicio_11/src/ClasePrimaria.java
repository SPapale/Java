import java.util.Scanner; 
public class ClasePrimaria {

	public static void main(String[] args) {
		// Scanner para leer el año
        Scanner scanner = new Scanner(System.in);

        // Se pide al usuario que ingrese un año
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        // Verificamos si es bisiesto 
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es un año bisiesto");
        } else {
            System.out.println(año + " no es un año bisiesto");
        }

	}

}
