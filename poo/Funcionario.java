package poo;

//Classe abstrata
public abstract class Funcionario extends Pessoa implements Beneficios{

	private String identificar;

	//Metodo abstrato para ser implementado na classe base
	public abstract void imprimirSetor();

	public String getIdentificar() {
		return identificar;
	}

	public void setIdentificar(String identificar) {
		this.identificar = identificar;
	}	
}
