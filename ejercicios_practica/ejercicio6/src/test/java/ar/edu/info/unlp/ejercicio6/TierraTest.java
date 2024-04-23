package ar.edu.info.unlp.ejercicio6;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Tierra{
    Tierra tierra;

    @BeforeEach
    void SetUp() throws Exception{
        tierra = new Tierra();
    }

    @Test
    void getProporcionTierraTest(){
        assertEquals(1, tierra.getProporcionTierra);
    }

    @Test
    void getProporcionAguaTest(){
        assertEquals(0, tierra.getProporcionAgua);
    }

    @Test
    void isEqualTest(){
        assertTrue(tierra.isEqual(new Tierra()));
        assertFalse(tierra.isEqual(new Agua()));
    }

}