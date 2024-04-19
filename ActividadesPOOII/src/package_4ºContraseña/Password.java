package package_4ºContraseña;

public class Password {
	private static final int DEFAULT_LENGTH = 8;
	private int longPassword;
	private String password;
	private int numGenerado;
	String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	// CONSTRUCTOR POR DEFECTO
	Password() {
		this(DEFAULT_LENGTH);
		password = "";
	}

	// CONSTRUCTOR DE LONGITUD ESPECÍFICA / GENERADOR DE CONTRASEÑAS
	//#####CAMBIAR A "RANDOM DE 1-8, EL CUAL TENGA QUE 1-5 GENERE NÚMEROS, SI ES 6-7 GENERE MINUSCULAS Y QUE 8 GENERE MAYUSCULAS"
	Password(int longitud) {
		for (int i = 0; i < longitud; i++) {
			
		}
	}

	public boolean esFuerte() {
		int contadorMinus = 0;
		String listaLetrasMinus = "abcdefghijklmnopqrstuvwxyz";
		int contadorMayus = 0;
		String listaLetrasMayus = listaLetrasMinus.toUpperCase();
		int contadorNum = 0;
		String listaNumeros = "0123456789";

		for (int i = 0; i < longPassword; i++) {
			for (int j = 0; j < listaLetrasMinus.length(); j++) {
				if (password.charAt(i) == listaLetrasMinus.charAt(j)) {
					contadorMinus++;
				} else if (password.charAt(i) == listaLetrasMayus.charAt(j)) {
					contadorMayus++;
				} else if (password.charAt(i) == listaNumeros.charAt(j)) {
					contadorNum++;
				}
			}
		}

		if (contadorMayus >= 2 && contadorMinus >= 1 && contadorNum >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public void generatePassword(int longitud, String _password) {
		password = _password;
	}

	public String getPassword() {
		return password;
	}

	public int getLongitud() {
		return longPassword;
	}

	public void setLongitud(int longitud) {
		this.longPassword = longitud;
	}
}
