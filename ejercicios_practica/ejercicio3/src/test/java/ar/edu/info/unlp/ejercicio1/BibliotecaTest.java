package ar.edu.info.unlp.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
    Biblioteca biblioteca;

    @BeforeEach
    void setUp() throws Exception{
        biblioteca = new Biblioteca();
        biblioteca.agregarSocio(new Socio("Franco", "franco@mail.com","1822-7"));
        biblioteca.agregarSocio(new Socio("Zelda", "zelda@mail.com", "1702-2"));
        biblioteca.exportarSocios();
    }

    @Test
    void testAgregarSocio(){
        assertTrue(biblioteca.exportarSocios().contains("Franco"));
        assertTrue(biblioteca.exportarSocios().contains("franco@mail.com"));
        assertTrue(biblioteca.exportarSocios().contains("1822-7"));

        assertFalse(biblioteca.exportarSocios().contains("Marcos"));
        assertFalse(biblioteca.exportarSocios().contains("hola@mail.com"));
        assertFalse(biblioteca.exportarSocios().contains("1111-2"));
    }

}