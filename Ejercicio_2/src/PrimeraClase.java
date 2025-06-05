
public class PrimeraClase {

	public static void main(String[] args) {
		for(int i=50; i<=100; i++) {
			int divisores=0;
			
			for(int j=1; j<= i; j++) {
				if(i % j ==  0) {
					divisores++;
				}
			}
			if(divisores == 2) {
				System.out.println("\n" + i + ": es primo");
			}
			else {
				System.out.println("\n" + i + ":  divisores    ");
				for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        System.out.print(j + " ");
                    }
                }
				
			}
		}

	}

}
