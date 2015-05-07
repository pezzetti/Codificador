package classes;

import java.util.HashMap;

public class Leet extends Codificador{


	public Leet(String texto) {		
		HashMap<String, String> dicionario = new HashMap<String, String>();		
		dicionario.put("a","@" );
		dicionario.put("b","|:");
		dicionario.put("c","[");
		dicionario.put("d","|>");
		dicionario.put("e","&");
		dicionario.put("f","Ph");
		dicionario.put("g","C-");
		dicionario.put("h","#");
		dicionario.put("i","!");
		dicionario.put("j","(/");
		dicionario.put("k","X");
		dicionario.put("l","1_");
		dicionario.put("m","|V|");
		dicionario.put("n","/V");
		dicionario.put("o","()");
		dicionario.put("p","|*");
		dicionario.put("q","(_,)");
		dicionario.put("r","12");
		dicionario.put("s","$");
		dicionario.put("t","+");
		dicionario.put("u","|_|");
		dicionario.put("v","|/");
		dicionario.put("w","VV");
		dicionario.put("x",")(");
		dicionario.put("y","`/");
		dicionario.put("z" , "%");
		super.setDicionario(dicionario);
		super.setTexto(texto);
		super.setEspaco_entre_letras(" ");
		super.setEspaco_entre_palavras("    ");
	}

	
	

}
