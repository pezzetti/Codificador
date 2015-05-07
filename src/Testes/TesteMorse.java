package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Codificador;
import classes.Morse;

public class TesteMorse {

	private Codificador codificador;
	
	@Test
	public void testaCodificaLetraEmMorse() {
		codificador = new Morse("a"); 
		assertEquals(".-", codificador.codifica());
	}

	@Test
	public void testaCodificaPalavraEmMorse(){
		codificador = new Morse("abc"); 
		assertEquals(".- -... -.-.", codificador.codifica());
	}
	
	@Test
	public void testaCodificaTextoEmMorse(){
		codificador = new Morse("abc def"); 
		assertEquals(".- -... -.-.   -.. . ..-.", codificador.codifica());
	}
	
	@Test
	public void testaDecodificaLetraMorse(){
		codificador = new Morse(".-"); 
		assertEquals("a", codificador.decodifica());
	}
	
	@Test
	public void testaDecodificaPalavraMorse(){
		codificador = new Morse(".- -... -.-."); 
		assertEquals("abc", codificador.decodifica());
	}
	
	@Test
	public void testaDecodificaTextoMorse(){
		codificador = new Morse(".- -... -.-.   -.. . ..-."); 
		assertEquals("abc def", codificador.decodifica());		
	}
	

}
