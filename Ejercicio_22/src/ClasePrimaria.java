import java.util.Scanner;
public class ClasePrimaria {

	public static void main(String[] args) {
		
		double[] calificaciones = new double[5];

      
        Scanner scanner = new Scanner(System.in);

       
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificacion " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        double suma = 0; 

        
        for (double calificacion : calificaciones) {
            suma = suma + calificacion;
        }

        
        double promedio = suma / calificaciones.length;
        System.out.println("El promedio es: " + promedio);

	}

}
