package ar.edu.info.unlp.ejercicio6;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaMixtaTest{
    TopografiaMixta mixta1 = new TopografiaMixta();
    TopografiaMixta mixta2 = new TopografiaMixta();
    Agua agua1;
    Agua agua2;
    Tierra tierra1;
    Tierra tierra2;

    @BeforeEach
    void SetUp() throws Exception{
        agua1 = new Agua();
        agua2 = new Agua();
        tierra1 = new Tierra();
        tierra2 = new Tierra();

        mixta1.addComponent(agua1);
        mixta1.addComponent(agua2);
        mixta1.addComponent(tierra1);
        mixta1.addComponent(tierra2);
        
        mixta2.addComponent(tierra1);
        mixta2.addComponent(agua1);
        mixta2.addComponent(tierra2);
        mixta2.addComponent(agua2);
    }

    @Test
    void getProporcionAguaTest(){
        assertEquals(0.5, mixta1.getProporcionAgua());
        assertEquals(0.5, mixta2.getProporcionAgua());

    }

    @Test
    void getProporcionTierraTest(){
        assertEquals(0.5, mixta1.getProporcionTierra());
        assertEquals(0.5, mixta2.getProporcionTierra());
    }

    @Test
    void isEqualTest(){
        assertTrue(mixta1.isEqual(mixta2));
        assertFalse(mixta1.isEqual(new Tierra()));
        assertFalse(mixta1.isEqual(new Agua()));
    }
}