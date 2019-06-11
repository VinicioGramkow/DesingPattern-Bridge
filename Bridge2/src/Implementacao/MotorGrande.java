package Implementacao;

import Interfaces.Motor;

public class MotorGrande implements Motor{

	public MotorGrande() {

	}

	@Override
	public void info() {
		System.out.println("Possui motor grande!");
	}

}
