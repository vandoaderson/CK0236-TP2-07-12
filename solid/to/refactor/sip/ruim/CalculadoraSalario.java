package solid.to.refactor.sip.ruim;

import static solid.to.refactor.sip.ruim.Cargo.DBA;
import static solid.to.refactor.sip.ruim.Cargo.DESENVOLVEDOR;
import static solid.to.refactor.sip.ruim.Cargo.GERENTE;

public class CalculadoraSalario {
	
	public double calcularSalario(Funcionario funcionario) {
		return funcionario.getCargo().getCalculaSalario() * funcionario.getSalario();
	}

}
