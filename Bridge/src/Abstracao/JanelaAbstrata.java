package Abstracao;

import Interfaces.Janela;

public abstract class JanelaAbstrata implements Janela {

	protected Janela janela;

	public JanelaAbstrata(Janela janela) {
		this.janela = janela;
	}
	
	public void desenharJanela(String titulo) {
		janela.desenharJanela(titulo);
	}
	
	public void desenharBotao(String titulo) {
		janela.desenharBotao(titulo);
	}

	public abstract void desenhar();

}
