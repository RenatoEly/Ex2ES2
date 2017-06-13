package geradorNF.model;

public class NotaFiscal {
	
	private Fatura fatura;
	
	public NotaFiscal(Fatura fatura){
		this.fatura = fatura;
	}

	public String getCliente() {
		return fatura.getCliente();
	}

	public double getValor() {
		return fatura.getvalor();
	}

	public double getImposto() {
		Servico servico = fatura.getTipoServico();
		return servico.getImposto(fatura.getvalor());
	}
}
