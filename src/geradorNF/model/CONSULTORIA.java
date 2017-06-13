package geradorNF.model;

public class CONSULTORIA implements Servico{

	private static final CONSULTORIA instance = new CONSULTORIA();
	private final double PORCENTAGEM = 0.25;
	private CONSULTORIA(){
		
	}
	
	public static CONSULTORIA getServico(){
		return instance;
	}

	@Override
	public double getImposto(double valor) {
		return valor * PORCENTAGEM;
	}
	
	
}
