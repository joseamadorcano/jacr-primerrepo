package package_4ºContraseña;

import java.util.Scanner;

public class Principal {
	/*
	 * 4. Implementa una clase llamada Contrasena que siga las siguientes condiciones:
	 * 
	 * Tendrá los atributos longitud y contrasena. Por defecto, la longitud será de 8.
	 * La contraseña podrá tener letras y números Los constructores serán los siguientes:
	 * 
	 * ● Un constructor por defecto.
	 * ● Un constructor con la longitud que nosotros le pasemos.
	 * 
	 * Generara una contraseña aleatoria con esa longitud. Los métodos que implementa serán:
	 * 
	 * ● esFuerte(): devuelve un booleano, para que sea fuerte debe tener más de 2 mayúsculas, más de 1 minúscula y más de 5 números.
	 * ● generarContrasena(): genera la contraseña del objeto con la longitud que tenga.
	 * ● Método get para contraseña y longitud.
	 * ● Método set para longitud.
	 * 
	 * Ahora, crea una clase clase Principal (con método main):
	 * ● Crea un array de objetos Contrasena con el tamaño que tu le indiques por teclado.
	 * ● Crea un bucle que cree un objeto para cada posición del array.
	 * ● Indica también por teclado la longitud de los Passwords (antes de bucle).
	 * ● Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
	 * Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior).
	 * Usa este simple formato:
	 * contraseña1 --- valor_booleano1
	 * contraseña2 --- valor_bololeano2
	 */
	
	final static int MIN_PASSWORD = 1;
	final static int MAX_PASSWORD = 50;
	
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int numPassword;
		
		do {
			System.out.println("Hasta cuantas contraseñas quiere almacenar? MAX-50");
			numPassword = Integer.parseInt(enter.nextLine());
			if (numPassword < MIN_PASSWORD || numPassword > MAX_PASSWORD) {
				System.out.println("");
			}
		} while (numPassword < MIN_PASSWORD || numPassword > MAX_PASSWORD);

		enter.close();
	}

}
