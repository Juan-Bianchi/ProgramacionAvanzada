package ejercicio10;

public class Factorial {
	public long factorialIterado(int n) {
		long factorial = 1;
		long startTime = System.currentTimeMillis();
		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
    System.out.println("Tiempo transcurrido factorial iterado: " + elapsedTime + " milisegundos");
    
		return factorial;
	}
	
	public long factorialRecursivo(long factorial) {
		if(factorial <= 1) {
			return factorial;
		}
		
		return factorial * factorialRecursivo(factorial-1);
	}
	
}
