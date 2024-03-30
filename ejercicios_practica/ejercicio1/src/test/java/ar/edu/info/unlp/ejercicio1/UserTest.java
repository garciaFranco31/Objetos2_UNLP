package ar.edu.info.unlp.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {
	@Test
    public void testCrearTwit() {
        User user = new User("Bardo");
        user.createPublication("Hola mundo");
        String cadena = "asddddaasdsrgrtrddagasdgdggasghthtwhwrtehsdffvdwfefdddddddddddddddddsasfahfahfhashfsafasufasdddddddddddddddddddddaaaaaaaaaaaaaaaaadgkgiuhqwdofogfoidgfSAGFgfaaaaassssssssgfghdyrghwhhgfjsasifhaifhashfihiafsssssssssssssssssssssssssssssssssssssssssssssssssssssafasfsfafasfsfsfasffdfdf";
        user.createPublication(cadena);
        assertEquals(2,user.showAllPublications().size());
    }

    @Test
    public void testEliminarPublicacion(){
        
    }
}
