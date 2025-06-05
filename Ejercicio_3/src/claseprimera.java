import java.util.Scanner; 

public class claseprimera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero; 
        
        
        while (true) {
            System.out.println("Ingrese un numero ");
            numero = scanner.nextInt(); 
            
            if(numero % 2 == 0 && numero >= 100) {
                System.out.println("El numero " + numero + " es mayor o igual 100 y primo");
                break;  
            }
            else {
                System.out.println("Segui probando");
            }
        }
        
        scanner.close();
    }
}
