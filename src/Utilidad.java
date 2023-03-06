/**
 * @author antony
 * @version 1.0
 * @since 06/03/23
 */
 

//@return metodo utlidad
public class Utilidad {

	//@param 1ºparametro
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	//@param 2ºparametro
	
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	
	//@return metodo refactorizacionD
	public boolean refactorizacionD(int a, int b) {
		//@param Calculo Ãºnico
		int c = a + b;
		//@param Calculo Ãºnico
		int d = c + 34;
		
		//@param Calculo si d es primo
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
	
		boolean resultado = !esPrimo;
		return (resultado);
	}

	//@param 1ºparametro
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	
}
