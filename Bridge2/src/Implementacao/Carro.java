package Implementacao;

import Abstracao.Veiculo;
import Interfaces.Motor;

public class Carro extends Veiculo{
	
	public Carro(final Motor motor) {
		this.motor = motor;
	}

	@Override
	public void criar() {
		System.out.println("\nO carro está pronto!");
		motor.info();
	}

}
