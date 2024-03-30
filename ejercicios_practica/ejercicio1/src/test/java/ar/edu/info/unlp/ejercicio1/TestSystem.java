package ar.edu.info.unlp.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSystem {
	TwSystem twitter;

    @BeforeEach
    void setUp() throws Exception{
        twitter = new TwSystem();
    }

    @Test
    void testCrearUsuario(){
        twitter.createUser("Franco");
        twitter.createUser("Ander");
        twitter.createUser("Franco");
        assertEquals(2, twitter.getUsers().size());
    }
}
