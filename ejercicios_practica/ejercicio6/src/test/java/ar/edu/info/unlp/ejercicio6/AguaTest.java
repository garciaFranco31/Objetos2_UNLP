package ar.edu.info.unlp.ejercicio6;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AguaTest{
	Agua agua;

	@BeforeEach
	void SetUp() throws Exception{
		agua = new Agua();
	}

	@Test
	void getProporcionAguaTest(){
		assertEquals(1, agua.getProporcionAgua);
	}

	@Test
	void getProporcionTierraTest(){
		assertEquals(0, agua.getProporcionTierra);
	}

	@Test
	void isEqualTest(){
		assertTrue(agua.isEqual(new Agua()));
		assertFalse(agua.isEqual(new Tierra()));
	}
}