import java.util.Scanner;
public class ClasePrimaria {

	public static void main(String[] args) {
		// Scanner para leer entradas
        Scanner scanner = new Scanner(System.in);

        // Pedimos dos números
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();

        // Mostramos opciones
        System.out.println("Seleccione una operacion: 1. Suma, 2. Resta, 3. Multiplicar"
        		+ ", 4. Divide");
        int opcion = scanner.nextInt();

        double resultado = 0; // Variable para guardar el resultado

        // Realizamos la operación según la opción ingresada
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir por cero");
                	}
                break;
            }

        // Mostramos el resultado
        System.out.println("Resultado: " + resultado);

	}

}
