package Main;

import ejercicio10.Factorial;
import ejercicio11.EntornoProgramacion;

public class Main {

	public static void main(String[] args) {
		long cantPruebas = 100_000_000;
		EntornoProgramacion ej11 = new EntornoProgramacion();
		ej11.probarSumas(cantPruebas);
		ej11.probarMultiplicaciones(cantPruebas);
		ej11.probarDivisiones(cantPruebas);
		ej11.probarComparaciones(cantPruebas);
		ej11.probarAsignaciones(cantPruebas);
		
		Factorial factorial = new Factorial();
		
		System.out.println(factorial.factorialIterado(10));
		long startTime = System.currentTimeMillis();
		System.out.println(factorial.factorialRecursivo(10));
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
    System.out.println("Tiempo transcurrido factorial recursivo: " + elapsedTime + " milisegundos");
	}

}
