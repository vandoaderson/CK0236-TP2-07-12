package poo;

public class Professor extends Funcionario{

	@Override
	public void imprimirSetor() {
		System.out.println("Trabalha na docencia ... ");
		
	}

	@Override
	public boolean temValeAlimentacao() {
		return true;
	}

	@Override
	public boolean temPlanoSaude() {		
		return true;
	}

}
