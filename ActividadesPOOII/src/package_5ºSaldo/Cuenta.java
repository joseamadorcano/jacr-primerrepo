package package_5ºSaldo;

import java.text.DecimalFormat;

public class Cuenta {
	//atributos para la generación de objetos
	private final int MIN_DINERO = 0;
	private final int MAX_DINERO = 20000;
	private final int MAX_REINTEGRO = 100;
	private final int MAX_INGRESO = 250;
	private int numReintegros;
	private int numIngresos;
	private double saldo;
	//Limitador del saldo para evitar exceder valores numéricos
	DecimalFormat saldoFormat = new DecimalFormat("#.##");
	
	//CONSTRUCTOR SIN PARAMETROS
	Cuenta(){
		this(0.00);
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Cuenta(double saldo) {
		if (saldo < MIN_DINERO || saldo > MAX_DINERO) {
			this.saldo = 0;
		} else {
			this.saldo = saldo;
		}
		numReintegros = 0;
		numIngresos = 0;
	}
	
	//METODO PARA ASIGNAR EL SALDO INICIAL
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	//METODO PARA DEVOLVER EL SALDO
	public double getSaldo(){
		return this.saldo;
	}
	
	//METODO PARA VERIFICAR EL REINTEGRO
	private boolean reintegroValido(double reintegro) {
		if (reintegro > this.saldo || reintegro > MAX_REINTEGRO) {
			return false;	
		} else {
			return true;
		}
	}
	
	//METODO PARA VERIFICAR EL INGRESO
	private boolean ingresoValido(double ingreso) {
		if (ingreso > MAX_INGRESO) {
			return false;	
		} else {
			return true;
		}
	}
	//METODO PARA MOSTRAR LOS PARAMETROS DE LA CUENTA
	public String toString() {
		return "Cuenta:\nNº de transacciones de reintegro = " + numReintegros + "\nNº de transacciones de ingreso = " + numIngresos + "\nSaldo = " + saldo;
	}
	//METODO PARA HACER UN REINTEGRO
	public boolean hacerReintegro(double reintegro) {
		if (reintegroValido(reintegro)) {
			this.saldo -= reintegro;
			this.numReintegros++;
			return true;
		} else {
			return false;
		}
	}
	//METODO PARA HACER UN INGRESO
	public boolean hacerIngreso(double ingreso) {
		if (ingresoValido(ingreso)) {
			this.saldo += ingreso;
			this.numIngresos++;
			return true;
		} else {
			return false;
		}
	}
}
