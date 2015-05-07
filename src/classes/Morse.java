package classes;

import java.util.HashMap;

public class Morse extends Codificador {

	public Morse(String texto) {

		HashMap<String, String> dicionario = new HashMap<String, String>();		
		dicionario.put("a",".-" );
		dicionario.put("b","-...");
		dicionario.put("c","-.-.");
		dicionario.put("d","-..");
		dicionario.put("e",".");
		dicionario.put("f","..-.");
		dicionario.put("g","--.");
		dicionario.put("h","....");
		dicionario.put("i","..");
		dicionario.put("j",".---");
		dicionario.put("k","-.-");
		dicionario.put("l",".-..");
		dicionario.put("m","--");
		dicionario.put("n","-.");
		dicionario.put("o","---");
		dicionario.put("p",".--.");
		dicionario.put("q","--.-");
		dicionario.put("r",".-.");
		dicionario.put("s","...");
		dicionario.put("t","-");
		dicionario.put("u","..-");
		dicionario.put("v","...-");
		dicionario.put("w",".--");
		dicionario.put("x","-..-");
		dicionario.put("y","-.--");
		dicionario.put("z" , "--..");
		dicionario.put("0" , "-----");
		dicionario.put("1" , ".----");
		dicionario.put("2" , "..---");
		dicionario.put("3" , "...--");
		dicionario.put("4" , "....-");
		dicionario.put("5" , ".....");
		dicionario.put("6" , "-....");
		dicionario.put("7" , "--...");
		dicionario.put("8" , "---..");
		dicionario.put("9" , "----.");
		
		super.setDicionario(dicionario);
		super.setTexto(texto);
		super.setEspaco_entre_letras(" ");
		super.setEspaco_entre_palavras("   ");
	}

	

}
