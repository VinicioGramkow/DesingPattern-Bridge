package Implementacao;

import Abstracao.JanelaAbstrata;
import Interfaces.Janela;

public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(Janela janela) {
		super(janela);
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Di�logo");
		desenharBotao("Bot�o Sim");
		desenharBotao("Bot�o N�o");
		desenharBotao("Bot�o Cancelar");
	}

}
