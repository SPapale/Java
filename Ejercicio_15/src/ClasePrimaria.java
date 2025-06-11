import java.util.Scanner; 
public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int saldoBase = 1000, saldo=0, opcion; 
		do {
		System.out.println("Ingrese una opcion. 1. Consulta de Saldo, 2. Retiro, 3. Deposito, 4. Salir:  ");
	    opcion = scanner.nextInt(); 
		switch(opcion) {
		case 1: 
			saldo = saldoBase; 
			System.out.println("Saldo actual: " + saldo);
			break; 
		
		case 2: 
			System.out.println("Ingrese la cantidad a retirar: ");
			int retirar = scanner.nextInt(); 
			if(retirar > saldo) {
				System.out.println("No se puede retirar una cantidad mayor al saldo disponible");
			}
			else {
			saldo = saldo + saldoBase - retirar; 
			System.out.println("Saldo actual: " + saldo);
			}
			break; 
		
		case 3: 
			System.out.println("Ingrese la cantidad a depositar: ");
			int depositar = scanner.nextInt();
			saldo = saldo + depositar; 
			System.out.println("Saldo actual: " + saldo);
			break; 
		}
		}while(opcion != 4); 

	}

}	
