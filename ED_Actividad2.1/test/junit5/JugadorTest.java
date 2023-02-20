package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import Jugador.Jugador;

class JugadorTest {
	private Jugador player1;
	
	//Creamos un @BeforeEach y un @AfterEach para tener un jugador limpio para cada test que vamos a realizar.
	@BeforeEach
	void setUp() throws Exception {
		player1 = new Jugador();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		player1 = null;
	}

	//Test para comprobar que el dorsal que le pasamos es el mismo que recibe.
	@Test
	void ponerDorsalTest() {
				
		player1.ponerDorsal(5);
		
		int dorsalEsperado = player1.getDorsal();
		int dorsalActual = 5;
		assertEquals(dorsalEsperado, dorsalActual); // 
		
	}
	
	//Test para saber si la condicion de que devuelva -1 cuando el numero del dorsal sea mayor que 30.
	@Test
	void ponerDorsalMenorQueUnoTest() {		
		player1.ponerDorsal(0);
		
		int dorsalEsperado = player1.getDorsal();
		int dorsalesperado =-1;
		
		assertEquals(dorsalesperado, dorsalEsperado);
	}
	
	//Test para saber si la condicion de que devuelva -1 cuando el número del dorsal sea mayor que 30.
	@Test
	void ponerDorsalMayorQueTreintaTest() {		
		player1.ponerDorsal(31);
		
		int dorsalEsperado = player1.getDorsal();
		int dorsalesperado =-1;
		
		assertEquals(dorsalesperado, dorsalEsperado);
	}
	
	
	//Test para saber si el jugador esta expulsado por tarjetas amarillas.
	@Test
	void estaExpulsadoTestDobleAmarilla() {
		player1.setNumeroTarjetasAmarillas(2);		
		
		assertTrue(player1.estaExpulsado());
	}
	
	//Test para saber si el jugador esta expulsado por tarjeta roja.
		@Test
		void estaExpulsadoTestPorRoja() {
			player1.setNumeroTarjetasRojas(1);	
			
			assertTrue(player1.estaExpulsado());
		}
	
	
	//Test para saber si el jugador no esta expulsado con una amarilla.
	@Test
	void noEstaExpulsadoTestUnaAmarilla() {
		player1.setNumeroTarjetasAmarillas(1);
		
		assertFalse(player1.estaExpulsado());
	}
	
	//Test para saber si el jugador no esta expulsado sin tarjeta roja
		@Test
		void noEstaExpulsadoTestSinRoja() {
			player1.setNumeroTarjetasRojas(0);
			
			assertFalse(player1.estaExpulsado());
		}

	

}
