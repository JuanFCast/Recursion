package ui;

public class Main {
	/*                         TIPOS DE RECURSION
	 * Recursi�n Directa: Es cuando el llamdo recursivo se hace en la misma funci�n
	 * Recursi�n Indirecta: Es cuando el llamdo recursivo se hace por intermedio de otro m�todo
	 * 		A(n) = B(n)+n
	 * 		B(n) = A(n-1)/n
	 * Recursi�n Lineal: un m�todo que tiene un �nico llamado recursivo
	 * Recursi�n M�ltiple: un m�todo que tiene m�s de un llamdo recursivo dentro de su soluci�n
	 * Recursi�n Final: la �ltima operaci�n que se hace es un llamado recursivo
	 * 
	 * Recursi�n No Final (cola): unido a el llamado recursivo tiene alguna operaci�n
	 * 
	 * 
	 */

	public static void main(String[] args) {
		//System.out.println(sumatoria(5));
		//System.out.println(sumaRecur(22000));
		//System.out.println(factorial(10));
		//System.out.println(factorialRecur(10));
		System.out.println(sumaRecurFinal(100,0));
	}
	
	// sumar los n�meros del 1 al 5
	public static int sumatoria(int n){
		int i = 0;
		int suma = 0; 
		while (i <= n) {
			suma = suma + i;
			i++;
		}
		
		return suma;
	}
	
	
	// sumar recursivamente los n�meros del 0 al 5
	
	// suma del 0 al 5 es: 0+1+2+3+4+5
	// suma(5) = sum(4)+5 ... suma(3)+4.. suma(2)+3 ... suma(1)+2 ... suma(0)+1 ...
	
	// caso base es: n == 0
	// caso recursivo:
	public static long sumaRecur(int n) {
		if (n == 0) { // caso base
			return 0;
		}else {
			return sumaRecur(n-1) + n;
		}
	}
	
	
	// sumatoria Recursiva Final (sin la suma unida al llamado)
	// estrategia por acumulaci�n de par�metros
	public static long sumaRecurFinal(int n, long resultado) {
		if (n == 0) { // caso base
			return resultado;
		}else {
			resultado +=n;
			return sumaRecurFinal(n-1, resultado);
		}
	}
	
	
	
	// TAREA PARA EL MIERCOLES factorial iterativo y recursivo
	public static int factorial(int n) {
		int fact = 1;
        int i = 2;
        if (n>=0) {
        	while (i <= n) {
            	fact *= i;
                i++;
            }
            return fact;
		}else {
			return n;
		}
	}
	
	public static int factorialRecur(int n) {
		if (n>=0) {
			if (n==0) {
				return 1;
			}else {
				return n * factorial(n-1);
			}
		}else {
			return n;
		}
		
	}
	
	// la serie Fibonacci
	// 1 2 3 4 5 6  7  8  9 10
	// 1,1,2,3,5,8,13,21,34,55
	// Fibo(n) = fibo(n-1)+fibo(n-2)
	// precondition n > 0
	public static long fibonacci(int n) {
		if (n>=0 && n<=2) {
			return 1;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	
	// vamos a crear el m�todo adicionar un proveedor (al final de la lista) pero lo haremos con recursi�n;
	
	
	
	

}
