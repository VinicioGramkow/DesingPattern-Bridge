package Main;

import Abstracao.JanelaAbstrata;
import Implementacao.JanelaAviso;
import Implementacao.JanelaDialogo;
import Implementacao.JanelaLinux;
import Implementacao.JanelaWindows;

public class Main {

	public static void main(String[] args) {

		JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
		janela.desenhar();

		janela = new JanelaAviso(new JanelaLinux());
		janela.desenhar();

		janela = new JanelaDialogo(new JanelaWindows());
		janela.desenhar();
	}
}
