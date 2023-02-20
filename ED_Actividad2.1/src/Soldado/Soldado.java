package Soldado;
/**
 * Clase que representa un soldado con dos atributos estaMuerto y numeroBalas
 * 
 * @author Christian
 * @version 1.0
 *
 */

public class Soldado {
	/**
	 * el soldado está muerto
	 */
	private boolean estaMuerto;
	/**
	 * Número entero que representa el numero de balas que tiene el soldado
	 */
    private int numeroBalas;
    
    public Soldado() {
		super();
	}
   
    public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
      
    
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

	/**
     * método que comprueba que el soldado puede disparar.
     * 
     * @return true si el valor de numeroBalas es mayor que 0. Si es menor devuelve false
     */
	public boolean puedeDisparar() {

                  if(this.numeroBalas > 0) {

                                return true;

                  }                          

                  return false;

    }

   /**
    * método que dispara al soldado y cambia el valor de estaMuerto de false a true.
    * 
    * @param sol soldado pasado por parámetro
    */

    public void disparar(Soldado sol) {

                  this.numeroBalas--;

                  sol.estaMuerto = true;

    }

}
