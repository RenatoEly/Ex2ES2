package calSalario;

public class Desenvolvedor implements Cargo{
	
	private int faixaSalarial = 3000;
	private Double min_desc = 0.1, max_desc = 0.2;
	
	public Desenvolvedor() {}

	@Override
	public double calculaDesconto(double salario) {
		if(salario >= faixaSalarial)
			return salario * max_desc;
		return salario* min_desc;
	}
}