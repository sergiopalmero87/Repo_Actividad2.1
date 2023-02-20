package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.Test;

import Jugador.Jugador;
import Soldado.Soldado;

class SoldadoTest {
	private Soldado sol1;
	
	//Creamos un @BeforeEach y un @AfterEach para tener un soldado limpio para cada test que vamos a realizar.
	@BeforeEach
	void setUp() throws Exception {
		sol1 = new Soldado();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		sol1 = null;
	}
	
	//Test para saber si el soldado puede disparar.
	@Test
	void siPuedeDispararTest() {
		sol1.setNumeroBalas(1);
		
		assertTrue(sol1.puedeDisparar());
	}
	
	//Segundo Test para saber si el soldado puede disparar.
	@Test
	void siPuedeDispararTest2() {
		sol1.setNumeroBalas(15);
			
		assertTrue(sol1.puedeDisparar());
	}
	
	//Test para saber si el soldado no puede disparar.
	@Test
	void NoPuedeDispararTest() {
		sol1.setNumeroBalas(0);
			
		assertFalse(sol1.puedeDisparar());
	}
	
	//Test para comprobar que el soldado2 está vivo antes de dispararle y muerto después
	@Test
	void dispararTestVivo() {
		Soldado sol2 = new Soldado(false, 0);
		
		assertFalse(sol2.isEstaMuerto());
		sol1.disparar(sol2);
		assertTrue(sol2.isEstaMuerto());
		
	
			
	}
	
	
	
     

}

	


