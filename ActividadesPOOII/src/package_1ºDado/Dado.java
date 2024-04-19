package package_1ºDado;

public class Dado {
	//atributos de nuestro objetos
	private int dado;
	//CONSTRUCTOR
	Dado(){
		lanzarDado();
	}
	
	//METODO PARA OBTENER EL NUMERO ALEATORIO
	public void lanzarDado() {
		//limitamos con "* 6" los números aleatorios a 0-5, y luego sumamos 1, para simular que has sacado un número 1-6
		dado = (int) ((Math.random() * 6) + 1);
	}
	//ENVIAR EL RESULTADO
	public int getDado(){
		//enviamos al main
		return dado;
	}
}
