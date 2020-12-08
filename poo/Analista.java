package poo;

public class Analista extends Funcionario {

	@Override
	public void imprimirSetor() {
		System.out.println("Trabalha na TI ... ");
		
	}

	@Override
	public boolean temValeAlimentacao() {
		return false;
	}

	@Override
	public boolean temPlanoSaude() {
		return false;
	}
}
