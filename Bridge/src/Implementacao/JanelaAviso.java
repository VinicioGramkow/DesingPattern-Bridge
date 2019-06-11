package Implementacao;

import Interfaces.Janela;
import Abstracao.JanelaAbstrata;

public class JanelaAviso extends JanelaAbstrata{

	public JanelaAviso(Janela janela) {
		super(janela);
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela Aviso");
		desenharBotao("Ok");
	}

}

