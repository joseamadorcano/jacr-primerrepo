package package_5ºSaldo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 5. Realizar un programa que permita gestionar el saldo de una cuenta
		 * corriente. Una vez introducido el saldo inicial, se mostrará un menú que
		 * permitirá efectuar las siguientes operaciones: 1. Hacer un reintegro, se
		 * pedirá la cantidad a retirar. 2. Hacer un ingreso, se pedirá la cantidad a
		 * ingresar. 3. Consultar el saldo y el número de reintegros e ingresos
		 * realizados. 4. Finalizar las operaciones. Debe confirmar si realmente desea
		 * salir e informar del saldo al final de todas las operaciones.
		 */

		Scanner enter = new Scanner(System.in);
		// objeto con los datos de la cuenta del usuario
		Cuenta cuenta = new Cuenta();
		// variables a usar en el menú
		double saldo, reintegro, ingreso;
		int opcSalida = 0;
		boolean confirmarSalida = false;
		String opcion = "";
		// peticion al usuario sobre cantidad de dinero inicial
		do {
			System.out.println("Introduzca su saldo inicial");
			saldo = Double.parseDouble(enter.nextLine());
			if (saldo < 0) {
				System.out.println("Tiene que añadir dinero, no eliminarlo");
			}
		} while (saldo < 0);
		// asignamos dicho dinero al saldo
		cuenta.setSaldo(saldo);
		// MENU PRINCIPAL
		do {
			System.out.println(
					"MENU PRINCIPAL - Elija una opción\nA. Hacer un reintegro\nB. Hacer un ingreso\nC. Mostrar saldo, Nº de reintegros y Nª ingresos totales\nD. Mostrar saldo final y salir");
			opcion = enter.nextLine().toUpperCase();
			// reset de booleano para transacciones

			switch (opcion) {
			// CASO A - HACER UN REINTEGRO EN LA CUENTA
			case "A":
				// pedimos al usuario cuanto quiere extraer
				System.out.println("Indique cuanto quiere extraer - MAX = 100€");
				reintegro = Double.parseDouble(enter.nextLine());
				// si se pasa del límite, se le indica y cicla
				// si el valor es correcto, se resta el valor de saldo, se indica y sale
				if (cuenta.hacerReintegro(reintegro)) {
					System.out.println("Reintegro exitoso, su nuevo saldo es de " + cuenta.getSaldo() + "€\n");
				} else {
					System.err.println("VALOR DE REINTEGRO NO REALIZADO");
				}
				break;
			case "B":
				// CASO B - HACER UN INGRESO EN LA CUENTA
				// pedimos al usuario cuanto quieren añadir
				System.out.println("Indique cuanto quiere ingresar - MAX = 250€");
				ingreso = Double.parseDouble(enter.nextLine());
				// si se pasa del límite, se le indica y cicla
				// si el valor es correcto, se suma el valor al saldo, se indica y sale
				if (cuenta.hacerIngreso(ingreso)) {
					System.out.println("Ingreso exitoso, su nuevo saldo es de " + cuenta.getSaldo() + "€\n");
				} else {
					System.out.println("VALOR DE INGRESO NO REALIZADO");
				}
				break;
			case "C":
				// CASO C - MOSTRAR SALDO Y Nº DE TRANSACCIONES
				System.out.println(cuenta.toString());
				break;
			case "D":
				// CASO D - SALIR DEL PROGRAMA
				do {
					// se muestra el saldo actual y se pregunta si quiere salir
					System.out.println("Su saldo actual es de " + cuenta.getSaldo()
							+ "€\nEstá seguro de que quiere salir? 0 = SI / 1 = NO");
					opcSalida = Integer.parseInt(enter.nextLine());
					if (opcSalida == 0) {
						// si elige que si, sale sin más
						System.out.println("Saliendo del programa...");
						confirmarSalida = true;
					} else if (opcSalida == 1) {
						// de lo contrario, sale de nuevo al menú para seguir haciendo movimientos
						System.out.println("Volviendo al menú\n");
					} else {
						System.out.println("Valor inválido, introduzca un valor nuevo");
					}
				} while (opcSalida != 1 && opcSalida != 0);
				break;
			default:
				// CASO DEFAULT - EVITAR ERRORES EXTERNOS
				System.out.println("VALOR INVALIDO, INTRODUCIR OTRO VALOR");
			}
		} while (!confirmarSalida);
		enter.close();
	}
}
