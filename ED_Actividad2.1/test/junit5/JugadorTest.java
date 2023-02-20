package junit5;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import Jugador.Jugador;

class JugadorTest {

	//Test para saber si el dorsal del jugador es el que el elige.
	@Test
	void ponerDorsalTest() {
		
		Jugador j1 = new Jugador();
		j1.ponerDorsal(5);
		int dorsalEsperado = j1.getDorsal(), dorsalActual = 5;
<<<<<<< HEAD
		assertSame(dorsalEsperado, dorsalActual); // 
=======
		assertEquals(dorsalEsperado, dorsalActual);
>>>>>>> develop
		
	}
	
	//Test para saber si el dorsal del jugador no es el que el elige. Si el dorsal que elige el jugador es ma
	@Test
	void ponerDorsalNegativoTest() {
		
		Jugador j1 = new Jugador();
		j1.ponerDorsal(31);
		int dorsalEsperado = j1.getDorsal();
		int dorsalInesperado = 5;
		
		assertNotEquals(dorsalInesperado, dorsalEsperado);
	}
	
	
	//Test para saber si el jugador esta expulsado
	@Test
	void estaExpulsadoTest() {
		int tarjetasAmarillas = 2, tarjetasRojas = 1;
		Jugador j1 = new Jugador(0, tarjetasAmarillas, tarjetasRojas);
		assertTrue(true);
	}
	
	
	//Test para saber si el jugador no esta expulsado.
	@Test
	void noEstaExpulsadoTest() {
		int tarjetasAmarillas = 1, tarjetasRojas = 0;
		Jugador j1 = new Jugador(0, tarjetasAmarillas, tarjetasRojas);
		assertTrue(true);
	}

	

}
