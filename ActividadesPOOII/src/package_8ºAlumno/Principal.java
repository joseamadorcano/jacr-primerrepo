package package_8ºAlumno;

import java.util.Scanner;

public class Principal {
	/*
	 * 8. Implementar la clase Alumno para poder manejar toda la información de cada alumno del instituto.
	 * Esta clase se compondrá de:
	 * ● Nombre - cadena que no puede estar vacía ni en blanco. En cuyo caso tendrá el valor “A cumplimentar”.
	 * ● Apellido1 - idem que nombre
	 * ● Apellido2 - cadena
	 * ● Dirección - cadena
	 * ● Número de teléfono - cadena, comprobar que todo son números, que tiene 9 números y que el primero
	 * comienza por 9, 7 o 6. En caso contrario, tendrá el valor “No válido”
	 * ● DNI - cadena - comprobar que sea correcto. En caso contrario, tendrá el valor “No válido”
	 * ● Asignaturas matriculadas - vector de cadena - no puede haber nombres vacíos
	 * ● Calificaciones - vector de reales Hay que implementar:
	 * ● Constructor parametrizado con nombre, apellido1, teléfono, dni, y nº de asignaturas matriculadas.
	 * ● Constructor parametrizado con nombre, apellido1, apellido2, dirección, tlfn, dni, y nº de asignaturas matriculadas.
	 * ● getters y setters correspondientes.
	 * ● matricular - habrá que indicar el nombre de la asignatura y comprobar que no estaba antes matriculado.
	 * ● añadir nota - habrá que indicar la asignatura y la nota
	 * (comprobar antes de añadir que la nota es un valor entre 0 y 10 y que el alumno está matriculado en la asignatura).
	 * ● modificar nota - habrá que indicar la asignatura y la nota
	 * (comprobar antes de modificar que el alumno está matriculado en la asignatura).
	 * ● métodos para realizar las comprobaciones pertinentes.
	 * ● calcular número de calificaciones suspensas ● calcular número de calificaciones aprobadas
	 * ● calcular nota media ● método toString con todos los atributos y las asignaturas matriculadas.
	 */
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.println("");
		
		enter.close();
	}
}
