import java.util.Scanner;
public class ClasePrimaria {

	public static void main(String[] args) {
		// Scanner para leer los números
        Scanner scanner = new Scanner(System.in);

        // Pedimos tres números enteros
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();

        // Suponemos que el primero es el mayor
        int mayor = num1;

        // Comparamos con el segundo
        if (num2 > mayor) {
            mayor = num2;
        }

        // Comparamos con el tercero
        if (num3 > mayor) {
            mayor = num3;
        }

        // Mostramos el resultado
        System.out.println("El numero mayor es: " + mayor);
	}

}
