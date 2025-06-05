

public class PrimeraClase {

	public static void main(String[] args) {
		int i, divisores=0;
		for(i=50; i<=100; i++) {
			if(i % 2 > 0) {
				divisores++;
			}
		}
		if(divisores == 2) {
			System.out.println("Es par");
		}

}
	
}