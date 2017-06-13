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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fatura == null) ? 0 : fatura.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaFiscal other = (NotaFiscal) obj;
		if (fatura == null) {
			if (other.fatura != null)
				return false;
		} else if (!fatura.equals(other.fatura))
			return false;
		return true;
	}
}
