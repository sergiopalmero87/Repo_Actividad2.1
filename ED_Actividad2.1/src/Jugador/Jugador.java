package Jugador;

/**
 * 
 * Entidad jugador con atributos privados dorsal, numeroTarjetasAmarillas y numeroTarjetasRojas.
 * 
 * Tendra diferentes metodos para realizar acciones con el jugador, tales como:
 * averiguar si el dorsal que elige luego es el que le corresponde y saber si esta expulsado o no.
 * 
 * @author Sergio Palmero
 * @version 1.0
 *
 */
public class Jugador {
	//Atributos privados
	/**
	 * Atributos privados: dorsal, numeroTarjetasAmarillas y numeroTarjetasRojas.
	 */
	private int dorsal, numeroTarjetasAmarillas, numeroTarjetasRojas;

	//Constructores
	/**
	 * Constructor por defecto
	 */
	public Jugador() {
		super();
	}

	/**
	 * Contrcutores con parametros.
	 * 
	 * @param dorsal Representa el dorsal del jugador.
	 * @param numeroTarjetasAmarillas Representa la cantidad de tarjetas amarillas que tiene el jugador.
	 * @param numeroTarjetasRojas Representa la cantidad de tarjetas rojas que tiene el jugador.
	 */
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	

	//Getter and Setter
	/**
	 * Getter and setter
	 * 
	 */
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
	
	
	//Metodos propios
	/**
	 * Metodo ponerDosal. Establece el numero de dorsal del jugador. 
	 * Si el dorsal que elige el jugador es mayor o igual a 1 y menor o igual a 30 entonces ese dorsal es el que le corresponde.
	 * Si esta fuera de este rango entonces el dorsal del jugador sera -1.
	 * 
	 * @param dorsal Dorsal que elige el jugador.
	 */
    public void ponerDorsal(int dorsal) {

        if(dorsal >= 1 && dorsal <= 30) {

                      this.dorsal = dorsal;

        }else {

                      this.dorsal = -1;

        }

}


    /**
     * Metodo estaExpulsado. Establece si el jugador esta expulsado o no.
     * Si el numero de tarjetas amarillas del jugador es igual a 2 
     * o si el numero de tarjetas rojas del jugador es igual a 1, entonces el jugador SI esta expulsado.
     * Por el contrario si no es asi el jugador NO esta expulsado.
     * 
     * @return true si el jugador esta expulsado y false si no esta expulsado.
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
	 
	 


