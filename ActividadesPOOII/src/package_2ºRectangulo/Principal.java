package package_2ºRectangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Crea una clase Rectangulo con los atributos longitud y ancho, cada uno con un valor
		  predeterminado igual a 1. Proporcionar los métodos set y get para los atributos longitud y
		  ancho respectivamente. El método set debe verificar que longitud y ancho contengan
		  números reales mayores que cero y menores que 20. Además, proporcionar métodos que
		  calculen el perímetro y el área del rectángulo.
		  Escribe un método main que solicite los datos de un rectángulo y muestre cual es su área y
		  su perímetro. Probar a introducir un dato incorrecto (mayor o igual que 20).*/
		Scanner enter = new Scanner(System.in);
		Rectangulo datosRect = new Rectangulo();
		String opcion;
		
		do {
			System.out.println("Elige una opción:\nA. Cambiar longitud y ancho\nB. Pedir parámetros longitud ancho\nC. Obtener perímetro y área con los parámetros actuales\nD. Salir del programa");
			opcion = enter.nextLine().toUpperCase();
			
			switch (opcion) {
			case "A":
				System.out.println("Introduce la longitud");
				
				System.out.println("Introduce el ancho");
				
				break;
			case "B":
				System.out.println("\nEl ancho actual es " + datosRect.getAncho());
				System.out.println("El largo actual es " + datosRect.getAncho() + "\n");
				break;
			case "C":
				break;
			case "D":
				System.out.println("\nSaliendo del programa...");
				break;
			default:
				System.out.println("\nLetra incorrecta, introduzca otra letra\n");
				break;	
			}
		} while (!opcion.equals("D"));
		enter.close();
	}

}
