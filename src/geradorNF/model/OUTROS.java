package geradorNF.model;

public class OUTROS implements Servico{

	private static final OUTROS instance = new OUTROS();
	private final double PORCENTAGEM = 0.06;
	private OUTROS(){
		
	}
	
	public static OUTROS getServico(){
		return instance;
	}
	
	@Override
	public double getImposto(double valor) {
		return valor * PORCENTAGEM;
	}
}
