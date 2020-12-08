package solid.to.refactor.ocp.ruim;

public class GerenciadorFaturas {
	
	private FilaContabilidade filaContabilidade;
	private EnviadorEmail enviadorEmail;
	
	public void pagarFatura(Fatura fatura) {
		fatura.setPaga();
	}
	public void adicionarFilaContabilidade(Fatura fatura){
		filaContabilidade.enviarParaFilaProcessamento(fatura);
	}
	public void enviarEmail(){
		enviadorEmail.enviar("email@email.com");
	}

}
