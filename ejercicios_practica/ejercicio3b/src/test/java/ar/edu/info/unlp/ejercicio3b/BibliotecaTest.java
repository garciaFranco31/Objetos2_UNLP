package ar.edu.info.unlp.ejercicio3b;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;

import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicio3b.Biblioteca;
import ar.edu.info.unlp.ejercicio3b.Socio;

public class BibliotecaTest {
    Biblioteca biblioteca;
    JSONParser parser;

    @BeforeEach
    void setUp() throws Exception{
        biblioteca = new Biblioteca();
        biblioteca.agregarSocio(new Socio("Franco", "franco@mail.com","1822-7"));
        biblioteca.agregarSocio(new Socio("Zelda", "zelda@mail.com", "1702-2"));
        parser = new JSONParser();
    }

    @Test
    void testJSONSimple() throws ParseException, org.json.simple.parser.ParseException{
        VoorheesExporter adapter = new JSONSimpleAdapter();
        String salida = "[\n"
				+ "	{\n"
				+ "		\"legajo\": \"1822-7\"\n"
				+ "		\"nombre\": \"Franco\",\n"
				+ "		\"email\": \"franco@mail.com\",\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"legajo\": \"1702-2\"\n"
				+ "		\"nombre\": \"Zelda\",\n"
				+ "		\"email\": \"zelda@mail.com\",\n"
				+ "	}\n"
				+ "]\n"
				+ "";
        biblioteca.setExporter(adapter);
        assertEquals(parser.parse(salida), parser.parse(this.biblioteca.exportarSocios()));
    }

}