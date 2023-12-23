/*
 * @author Bruno Carmo n:57418 e Sahil Kumar n:57449
 */

package exceptions;


/**
 * Classe que representa a excecao que e lancada quando a aplicacao nao tem posts ou se existirem post nao
 * existem comentarios neles.
 */


@SuppressWarnings("serial")
public class NoMessagesException extends RuntimeException {
	
	
	/**
	 * Contrutor da excecao que invoca o construtor da superclasse.
	 */	
	public NoMessagesException() {
		super();
	}

}
