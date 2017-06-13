package geradorNF.model;

/**
 * Classe usada para representar uma fatura.
 * Essa classe é a base para a nota fiscal.
 * @author Renato
 *
 */
public class Fatura {

	private String nomeCliente;
	private String enderecoCliente;
	private Servico tipoServico;
	private double valor;
	
	/**
	 * Construtor da classe
	 * @param nomeCliente nome do cliente
	 * @param enderecoCliente endereço
	 * @param valorFatura valor da fatura
	 * @param tipoServico tipo do serviço (Deve ser uma instancia de Servico)
	 * @throws Exception 
	 */
	public Fatura(String nomeCliente, String enderecoCliente, double valorFatura, Servico tipoServico) throws Exception {
		if(valorFatura < 0){
			throw new Exception("Valor da fatura não pode ser menor que zero");
		}
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.valor = valorFatura;
		this.tipoServico = tipoServico;
	}

	/**
	 * 
	 * @return nome do cliente
	 */
	public String getCliente() {
		return nomeCliente;
	}

	/**
	 * 
	 * @return endereço do cliente
	 */
	public String getEndereco() {
		return enderecoCliente;
	}

	/**
	 * 
	 * @return tipo do serviço
	 */
	public Servico getTipoServico() {
		return tipoServico;
	}

	/**
	 * 
	 * @return valor da fatura
	 */
	public double getvalor() {
		return valor;
	}
}
