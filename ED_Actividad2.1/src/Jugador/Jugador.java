package Jugador;
/**
 * Clase que representa un jugador con tres atributos, un dorsal, el número de tarjetas amarillas y el número de tarjetas rojas.
 * 
 * Esta clase puede determinar si un jugador está expulsado o no en función de su número de doral.
 * 
 * @author Christian
 * @version 1.0
 *
 */
public class Jugador {
	/**
	 * Número que representa el dorsal del jugador.
	 */
    private int dorsal;
    /**
     * Número de tarjetas amarillas que tiene el jugador.
     */
    private int numeroTarjetasAmarillas;
    /**
     * Número de tarjetas rojas que tiene el jugador.
     */
    private int numeroTarjetasRojas;
   
    public Jugador() {
		super();
	}
    
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
	super();
	this.dorsal = dorsal;
	this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	this.numeroTarjetasRojas = numeroTarjetasRojas;
	
	
}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	/**
	 * Método que asigna el dorsal al jugador. 
	 * Si el número que le asignamos se encuentra entre el 1 y el 30, se le asignará dicho número.
	 * Si le asignamos cualquier otro número entonces se le asignará el valor -1-
	 * 
	 * @param dorsal
	 */
	public void ponerDorsal(int dorsal) {

                  if(dorsal >= 1 && dorsal <= 30) {

                                this.dorsal = dorsal;

                  }else {

                                this.dorsal = -1;

                  }

    }
	/**
	 * Método que devuelve si el jugador está expulsado en base al número de tarjetas recibidas.
	 * 
	 *El valor por defecto de la variable expulsado es false.
	 * 
	 *@return Si el numero de tarjetas amarillas es igual a 2 cambia el valor de expulsado a true. 
	 * Si el numero de tarjetas rojas es igual a 1 cambia el valor de expulsado a true. 
	 * Al final del método devuelve el valor de la variable expulsado.	 * 
	 */
    public boolean estaExpulsado() {

                  boolean expulsado = false;                                                  

                  if(numeroTarjetasAmarillas == 2) {

                                expulsado = true;

                  }                          

                  if(numeroTarjetasRojas == 1) {

                                expulsado = true;

                  }                          

                  return expulsado;

    }            

}
