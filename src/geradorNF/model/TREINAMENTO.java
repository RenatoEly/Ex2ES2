package geradorNF.model;

public class TREINAMENTO implements Servico {

	private static final TREINAMENTO instance = new TREINAMENTO();
	private final double PORCENTAGEM = 0.15;
	private TREINAMENTO(){
		
	}
	
	public static TREINAMENTO getServico(){
		return instance;
	}

	@Override
	public double getImposto(double valor) {
		return valor * PORCENTAGEM;
	}
}
