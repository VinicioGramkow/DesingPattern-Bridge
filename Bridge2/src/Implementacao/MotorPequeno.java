package Implementacao;

import Interfaces.Motor;

public class MotorPequeno implements Motor{

	public MotorPequeno() {

	}

	@Override
	public void info() {
		System.out.println("Possui motor pequeno!");
	}

}
