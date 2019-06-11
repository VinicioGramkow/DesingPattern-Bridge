package Implementacao;

import Abstracao.Veiculo;
import Interfaces.Motor;

public class Caminhao extends Veiculo{
	
	public Caminhao(final Motor motor) {
		this.motor = motor;
	}

	@Override
	public void criar() {
		System.out.println("\nO caminhão está pronto!");
		motor.info();
	}

}
