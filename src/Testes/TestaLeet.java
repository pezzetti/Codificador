package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Codificador;
import classes.Leet;

public class TestaLeet {

	private Codificador codificador;
	
	@Test
	public void testaLetraEmLeet(){
		codificador = new Leet("a"); 
		assertEquals("@", codificador.codifica());
	}
	
	@Test
	public void testaPalavraEmLeet(){
		codificador = new Leet("nerd"); 
		assertEquals("/V & 12 |>", codificador.codifica());
	}
	
	@Test
	public void testaTextoEmLeet(){
		codificador = new Leet("eu sou nerd"); 
		assertEquals("& |_|    $ () |_|    /V & 12 |>", codificador.codifica());
	}
	
	
	@Test
	public void testaDecodificaLetraLeet(){
		codificador = new Leet("&"); 
		assertEquals("e", codificador.decodifica());
	}
	
	@Test
	public void testaDecodificaPalavraLeet(){
		codificador = new Leet("/V & 12 |>"); 
		assertEquals("nerd", codificador.decodifica());
	}
	
	@Test
	public void testaDecodificaTextoLeet(){
		codificador = new Leet("& |_|    $ () |_|    /V & 12 |>"); 
		assertEquals("eu sou nerd", codificador.decodifica());
		
	}
}
