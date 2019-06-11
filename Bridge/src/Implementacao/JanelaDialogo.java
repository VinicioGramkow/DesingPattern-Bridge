package Implementacao;

import Abstracao.JanelaAbstrata;
import Interfaces.Janela;

public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(Janela janela) {
		super(janela);
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Diálogo");
		desenharBotao("Botão Sim");
		desenharBotao("Botão Não");
		desenharBotao("Botão Cancelar");
	}

}
