package calSalario;

public class CalculadoraDeSalario {
	
	public CalculadoraDeSalario() {
		// TODO Auto-generated constructor stub
	}
	
	public double calculaSalario(Funcionario funcionario){
		return funcionario.getSalario() - funcionario.getCargo().calculaDesconto(funcionario.getSalario());
	}
}