package ejercicio10;

public class Factorial {
	public long factorialIterado(int n) {
		long factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
	
	public long factorialRecursivo(long factorial) {
		if(factorial <= 1) {
			return factorial;
		}
		
		return factorial * factorialRecursivo(factorial-1);
	}
	
}
