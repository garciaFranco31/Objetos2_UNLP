package ar.edu.info.unlp.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoTest {
	Juego juego;
	
	@BeforeEach
	void setUp() throws Exception {
        juego = new Juego();
	}
	
    @Test
    public void testJugadaGanada() {
        Jugada jugadaPiedra = new Piedra();
		Jugada jugadaTijera = new Tijera();

		assertEquals("Piedra wins", juego.jugarpartido(jugadaPiedra, jugadaTijera));
    }

	@Test
	public void testJugadaPerdida(){
		Jugada jugadaSpock = new Spock();
		Jugada jugadaLagarto = new Lagarto();

		assertEquals("Lagarto wins", juego.jugarpartido(jugadaSpock, jugadaLagarto));
	}
}