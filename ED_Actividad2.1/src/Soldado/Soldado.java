package Soldado;

/**
 * 
 * Entidad soldado con atributos privados estaMuerto y numeroBalas.
 * 
 * Tendra diferentes metodos para realizar acciones con el soldado, tales como:
 * averiguar si puede disparar y poder hacer esa accion.
 * 
 * @author Sergio Palmero
 * @version 1.0
 *
 */
public class Soldado {
	/**
	 * Atributo estaMuerto
	 */
	private boolean estaMuerto;

	/**
	 * Atributo numeroBalas
	 */

	private int numeroBalas;

	/**
	 * Constructor por defecto
	 */
	public Soldado() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param estaMuerto  representa si esta muerto o no
	 * @param numeroBalas representa el numero de balas
	 */
	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}

	// Getter and Setter
	/**
	 * Getter and setter
	 * 
	 */
	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	// Metodos propios
	/**
	 * 
	 * Metodo que establece si el soldado puede disparar. Si el numero de balas que
	 * tiene el soldado es mayor que 0 si que puede disparar. Si el numero de balas
	 * es menor que 0 no podra disparar.
	 * 
	 * @return true si puede disparar y false si no puede.
	 */

	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {

			return true;

		}

		return false;

	}

	/**
	 * 
	 * Metodo que establece la accion de disparar. El soldado pasado por parametro
	 * no puede ser nulo ni estar vacio
	 * 
	 * @param sol El soldado que realiza la accion de disparar.
	 * @throws IllegalArgumentException si soldado en nulo o esta vacio.
	 * 
	 */
	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;

	}

}



