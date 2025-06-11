import java.util.Scanner; 
public class ClasePrimaria {

	public static void main(String[] args) {
		 // Creamos Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos las longitudes de los lados
        System.out.print("Ingrese el primer lado: ");
        int lado1 = scanner.nextInt();

        System.out.print("Ingrese el segundo lado: ");
        int lado2 = scanner.nextInt();

        System.out.print("Ingrese el tercer lado: ");
        int lado3 = scanner.nextInt();

        // Verificamos tipo de triangulo
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es un triángulo equilatero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Es un triángulo isosceles");
        } else {
            System.out.println("Es un triángulo escaleno");
        }

	}

}
