package calSalario;

public class Testador implements Cargo{

	private static int faixaSalarial = 2000;
	private static Double min_desc = 0.15, max_desc = 0.25;
	
	public Testador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaDesconto(double salario) {
		if(salario >= faixaSalarial)
			return salario * max_desc;
		return salario* min_desc;
	}
}