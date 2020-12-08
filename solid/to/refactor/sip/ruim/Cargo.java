package solid.to.refactor.sip.ruim;

public enum Cargo {

	DBA(1.2),
	GERENTE(1.3),
	DESENVOLVEDOR(1.1);

	private double calculaSalario;

	Cargo(double calculaSalario) {
		this.calculaSalario = calculaSalario;
	}

	public double getCalculaSalario() {
		return this.calculaSalario;
	}

}
