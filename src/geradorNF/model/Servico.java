package geradorNF.model;

/**
 * Classe usada para diferenciar as formas de serviço e calcular o imposto de acordo com os mesmos.
 * @author Renato
 *
 */
public interface Servico {

	/**
	 * Retorna o valor do imposto da nota fiscal de acordo com o valor da fatura e o tipo do serviço.
	 * @param valor para a base do calculo
	 * @return valor do imposto
	 */
	public double getImposto(double valor);
}
