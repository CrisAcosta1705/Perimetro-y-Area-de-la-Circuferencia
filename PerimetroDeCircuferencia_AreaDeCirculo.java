package Ejercicio;
import java.util.Scanner;
public class PerimetroDeCircuferencia_AreaDeCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		double pi = 3.1416;
		int d, r; 
		double P, A;
		
		System.out.println("Ingrese el diametro de la circunferencia");
		d = tc.nextInt();
		
		P = pi*d;
		
		System.out.println("El perimetro de la circueferencia es: "+P);
		
		System.out.println("Ingrese el radio del circulo");
		r = tc.nextInt();
		
		A = pi*r*r;
		
		System.out.println("El area del circulo es: "+A);
	}

}
