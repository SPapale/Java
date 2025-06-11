import java.util.Scanner; 
import java.util.Random; 


public class ClasePrimaria {

	public static void main(String[] args) {
		// Creamos Scanner para leer del usuario y Random para generar el numero
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generamos un numero aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int intentos = 0; // Contador de intentos

        // Repetimos hasta que el usuario adivine
        do {
            // Pedimos al usuario que adivine
            System.out.print("Adivina el numero (entre 1 y 100): ");
            intento = scanner.nextInt();
            intentos++; // Aumentamos el numero de intentos

            // Damos pistas según el intento
            if (intento < numeroSecreto) {
                System.out.println("El numero es mayor");
            } else if (intento > numeroSecreto) {
                System.out.println("El numero es menor");
            }

        } while (intento != numeroSecreto); // Repetir hasta adivinar

        // Mostramos mensaje final
        System.out.println("Bien pe adivinaste en " + intentos + " intentos");
		
	}

}
