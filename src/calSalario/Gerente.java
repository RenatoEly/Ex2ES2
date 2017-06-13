package calSalario;

public class Gerente implements Cargo {
	
	private static int faixaSalarial = 5000;
	private static Double min_desc = 0.20, max_desc = 0.3;
	
	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaDesconto(double salario) {
		if(salario >= faixaSalarial)
			return salario * max_desc;
		return salario* min_desc;
	}
}