package package_1ºDado;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Implementa una clase Dado que simule el funcionamiento de un dado con caras
		 * del 1 al 6 que tienen la misma probabilidad de salir y una clase Principal en
		 * la que realices un programa de prueba. La clase tendrá un método generador
		 * aleatorio llamado lanzar() que devolverá el número aleatorio, además de
		 * actualizar el valor interno del dado.
		 * https://www.w3schools.com/java/java_math.asp Fíjate en el método
		 * Math.random()
		 */

		Scanner enter = new Scanner(System.in);
		// instanciamos un objeto que será asignado al metodo que buscamos
		Dado miDado = new Dado();
		int opcion;

		do {
			// invocamos el método de nuestra preferencia y mostramos
			System.out.println("Has sacado un " + miDado.getDado());
			// preguntamos si quiere lanzar de nuevo
			System.out.println("Quieres tirar de nuevo? 0 = salir");
			opcion = enter.nextInt();
			// si no quiere más tiradas, muestra este mensaje
			if (opcion == 0) {
				System.out.println("Saliendo...");
			} else {
				// llamamos al método que da el número nuevo
				miDado.lanzarDado();
			}
		} while (opcion != 0);
		enter.close();
	}

}
