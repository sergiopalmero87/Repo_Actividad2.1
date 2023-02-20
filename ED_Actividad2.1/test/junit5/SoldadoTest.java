package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.Test;

import Soldado.Soldado;

class SoldadoTest {
	
	//Test para saber si el soldado puede disparar.
	@Test
	void siPuedeDispararTest() {
		boolean estaMuerto = false;
		int numeroBalas = 5;
		Soldado s1 = new Soldado(estaMuerto, numeroBalas);
		assertTrue(s1.puedeDisparar());
	}
	
	
	//Test para saber si es verdad que el soldado no puede disparar
	@Test
	void noPuedeDispararTest() {
		boolean estaMuerto = false;
		int numeroBalas = -1;
		Soldado s2 = new Soldado(estaMuerto, numeroBalas);
		assertFalse(s2.puedeDisparar());
	}
	
     

}

	


