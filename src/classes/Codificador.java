package classes;

import java.util.HashMap;

public abstract class Codificador {
	protected String texto;
	protected HashMap<String, String> dicionario;
	
	protected  String espaco_entre_letras ;
	protected  String espaco_entre_palavras;
		
	
	public void setTexto(String texto){
		this.texto = texto;	
	}
	public void setDicionario( HashMap<String,String> dicionario){
		this.dicionario = dicionario;
	}
	
	protected void setEspaco_entre_letras(String espaco_entre_letras) {
		this.espaco_entre_letras = espaco_entre_letras;
	}
	
	protected void setEspaco_entre_palavras(String espaco_entre_palavras) {
		this.espaco_entre_palavras = espaco_entre_palavras;
	}
	
	
	public String codifica() {
		return codificaTexto();
	}
	
	
	private String codificaTexto(){
		String textoCodificado = "";
		String []palavra;
		palavra = texto.split(" ");
		for(int i = 0; i< palavra.length;i++){
			
			if(i+1 < palavra.length){
				textoCodificado += codificaPalavra(palavra[i]) + espaco_entre_palavras;
			}else
				textoCodificado += codificaPalavra(palavra[i]) ;
		}				
		return textoCodificado;
	}
	
	private String codificaPalavra(String palavra){
		String palavraCodificada = "";
		String letra;
		for(int i = 0; i< palavra.length(); i++){			
			letra = palavra.substring(i,i+1);	
			if(i+1 < palavra.length())
				palavraCodificada += codificaLetra(letra) + espaco_entre_letras;
			else
				palavraCodificada += codificaLetra(letra);
		}
		return palavraCodificada;
	}
	
	private String codificaLetra(String letra){
		return transformaCaractereEmLeet(letra);
	}

	private String transformaCaractereEmLeet(String caractere) {		
		return dicionario.get(caractere);
	}
	

	public String decodifica() {
		return decodificaTexto();
	}
	
	private String decodificaTexto(){
		String textoTraduzido ="";
		String[]palavraCodificada;
		palavraCodificada = texto.split(espaco_entre_palavras);
		for(int i = 0; i<palavraCodificada.length;i++){
			if(i+1 <palavraCodificada.length){
				textoTraduzido+= decodificaPalavra(palavraCodificada[i]) + espaco_entre_letras;
			}else
				textoTraduzido+= decodificaPalavra(palavraCodificada[i]);
			
		}
		
		return textoTraduzido;
	}
		
	private String decodificaPalavra(String palavraCodificada){
		String palavraTraduzida = "";
		String[] letraCodificada;
		letraCodificada = palavraCodificada.split(espaco_entre_letras);
		for(int i = 0; i< letraCodificada.length; i++){						
			palavraTraduzida += decodificaLetra(letraCodificada[i]);
		}
		return palavraTraduzida;
	}
	
	private String decodificaLetra(String letraCodificada){
		return transformaEmCaractere(letraCodificada);
	}
	
	private String transformaEmCaractere(String letraCodificada){
		 for(String key : dicionario.keySet()){
		        if(dicionario.get(key).equals(letraCodificada)){
		            return key; 
		        }
		    }
		return "";
	}
}
