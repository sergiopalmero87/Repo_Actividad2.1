package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Soldado.Soldado;

class SoldadoTest {

	@Test
	void siPuedeDispararTest() {
		Soldado s1 = new Soldado(false, 5);
		assertTrue(s1.puedeDisparar());
	}
	
	@Test
	void noPuedeDispararTest() {
		Soldado s2 = new Soldado(false, -1);
		assertFalse(s2.puedeDisparar());
	}

}
