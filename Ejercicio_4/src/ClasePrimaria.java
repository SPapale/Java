import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, sumaPar=0, sumaImpar=0; 
		System.out.println("Ingrese un numero entero positivo");
		numero = scanner.nextInt();
		
		for(int i = 1; i<=numero; i++) {
			 if(i%2 == 0) {
				 sumaPar = sumaPar + i;
			 }
			 else {
				 sumaImpar = sumaImpar + i;
			 }
		}
		System.out.println("La suma de los pares del numero " + numero + " es " + sumaPar);
		System.out.println("La suma de los impares del numero " + numero + " es " + sumaImpar);
	}

}
