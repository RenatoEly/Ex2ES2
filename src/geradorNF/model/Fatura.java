package geradorNF.model;

public class Fatura {

	private String nomeCliente;
	private String enderecoCliente;
	private Servico tipoServico;
	private double valor;
	
	public Fatura(String nomeCliente, String enderecoCliente, double valorFatura, Servico tipoServico) throws Exception {
		if(valorFatura < 0){
			throw new Exception("Valor da fatura não pode ser menor que zero");
		}
		if(tipoServico == null){
			throw new Exception("Fatura deve conter um tipo de serviço");
		}
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.valor = valorFatura;
		this.tipoServico = tipoServico;
	}

	public String getCliente() {
		return nomeCliente;
	}

	public String getEndereco() {
		return enderecoCliente;
	}

	public Servico getTipoServico() {
		return tipoServico;
	}

	public double getvalor() {
		return valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enderecoCliente == null) ? 0 : enderecoCliente.hashCode());
		result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
		result = prime * result + ((tipoServico == null) ? 0 : tipoServico.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Fatura other = (Fatura) obj;
		if (enderecoCliente == null) {
			if (other.enderecoCliente != null)
				return false;
		} else if (!enderecoCliente.equals(other.enderecoCliente))
			return false;
		if (nomeCliente == null) {
			if (other.nomeCliente != null)
				return false;
		} else if (!nomeCliente.equals(other.nomeCliente))
			return false;
		if (tipoServico == null) {
			if (other.tipoServico != null)
				return false;
		} else if (!tipoServico.equals(other.tipoServico))
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
	
	
}
