package package_8ºAlumno;

import java.text.DecimalFormat;

public class AlumnoDatos {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String telefono;
	private String dni;
	private String[] asignaturas;
	private int numAsig;
	private double[] calificaciones;
	
	DecimalFormat calificacionesFormat = new DecimalFormat("#,##");
	
	private AlumnoDatos(int numAsig) {
		asignaturas = new String [numAsig];
		this.nombre = "A cumplimentar";
		this.apellido1 = "A cumplimentar";
		this.apellido2 = "";
		this.direccion = "";
		this.telefono = "No valido";
		this.dni = "No valido";
		this.numAsig = 0;
	}
	
	
	
	private void matricularAsignatura(String asignatura){
		if (revisarAsignatura(asignatura)) {
			this.asignaturas[0] = asignatura;
			this.numAsig++;
		}
	}
	
	private boolean revisarAsignatura(String asignatura){
		for (int i = 0; i < numAsig; i++) {
			if ()
		}
	}
	
	private void comprobarDatos(String nombre, String apellido1) {
		if (nombre.isBlank()) {
			nombre = "A cumplimentar";
		} else {
			this.nombre = nombre;
		}
	}
}
