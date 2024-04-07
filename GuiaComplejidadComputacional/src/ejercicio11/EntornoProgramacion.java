package ejercicio11;

public class EntornoProgramacion {
	
	public long probarSumas(long iteraciones) {
		long i;
		long startTime = System.currentTimeMillis();
		for(i = 0; i < iteraciones; i++) {
			i++;
		}
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
        System.out.println("Tiempo transcurrido sumas: " + elapsedTime + " milisegundos");
		return i;
	}
	
	public long probarMultiplicaciones(long iteraciones) {
		long i;
		long startTime = System.currentTimeMillis();
		for(i = 0; i < iteraciones; i++) {
			i *= 1;
		}
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
        System.out.println("Tiempo transcurrido multiplicaciones: " + elapsedTime + " milisegundos");
		return i;
	}
	
	public long probarComparaciones(long iteraciones) {
		long i;
		long startTime = System.currentTimeMillis();
		for(i = 0; i < iteraciones; i++) {
			if ( i < 1) {
				
			}
		}
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
        System.out.println("Tiempo transcurrido comprobaciones: " + elapsedTime + " milisegundos");
		return i;
	}
	
	public long probarDivisiones(long iteraciones) {
		long i;
		long startTime = System.currentTimeMillis();
		for(i = 0; i < iteraciones; i++) {
			i /= 1;
		}
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
        System.out.println("Tiempo transcurrido divisiones: " + elapsedTime + " milisegundos");
		return i;
	}
	
	public long probarAsignaciones(long iteraciones) {
		long i;
		long j = 0;
		long startTime = System.currentTimeMillis();
		for(i = 0; i < iteraciones; i++) {
			j = i;
		}
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
        System.out.println("Tiempo transcurrido asignaciones: " + elapsedTime + " milisegundos");
		return j;
	}
	
}
