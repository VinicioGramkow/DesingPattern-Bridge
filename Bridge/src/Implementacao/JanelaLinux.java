package Implementacao;

import Interfaces.Janela;

public class JanelaLinux implements Janela{

	@Override
	public void desenharJanela(String titulo) {
		System.out.println(titulo + " - Janela Linux");	
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + " - Botão Linux");		
	}

}
