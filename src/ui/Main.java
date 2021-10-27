package ui;

public class Main {

	public static void main(String[] args) {
		//System.out.println(sumatoria(5));
		//System.out.println(sumaRecur(5));
		System.out.println(factorial(-1));
		System.out.println(factorialRecur(-1));
	}
	
	// sumar los números del 1 al 5
	public static int sumatoria(int n){
		int i = 0;
		int suma = 0; 
		while (i <= n) {
			suma = suma + i;
			i++;
		}
		
		return suma;
	}
	
	
	// sumar recursivamente los números del 0 al 5
	
	// suma del 0 al 5 es: 0+1+2+3+4+5
	// suma(5) = sum(4)+5 ... suma(3)+4.. suma(2)+3 ... suma(1)+2 ... suma(0)+1 ...
	
	// caso base es: n == 0
	// caso recursivo:
	public static int sumaRecur(int n) {
		if (n == 0) { // caso base
			return 0;
		}else {
			return sumaRecur(n-1) + n;
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
	
	
	
	
	

}
