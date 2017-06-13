package calSalario;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestaCalculadoraDeSalario {
	
	private CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
	private Funcionario funcionario;
	

	@Test
	public void testeCalcSalarioDesenvolvedor() {
		funcionario =  new Funcionario("nome", "email@fake.com", 2000, new Desenvolvedor());
		Assert.assertEquals(1800.0, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
		
		funcionario =  new Funcionario("nome", "email@fake.com", 3000, new Desenvolvedor());
		Assert.assertEquals(2400.0, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
		
		funcionario =  new Funcionario("nome", "email@fake.com", 3001, new Desenvolvedor());
		Assert.assertEquals(2400.8, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
	}
	
	@Test
	public void testeCalcSalarioDBA(){
		funcionario =  new Funcionario("nome", "email@fake.com", 1000 ,new DBA() );
		Assert.assertEquals(850, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
		
		funcionario =  new Funcionario("nome", "email@fake.com",2000 , new DBA());
		Assert.assertEquals(1500.0, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
		
		funcionario =  new Funcionario("nome", "email@fake.com", 2001, new DBA());
		Assert.assertEquals(1500.75, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
	}
	
	@Test
	public void testeCalcSalarioTestador(){
		funcionario =  new Funcionario("nome", "email@fake.com", 1000, new Testador());
		Assert.assertEquals(850, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
		
		funcionario =  new Funcionario("nome", "email@fake.com", 2000, new Testador());
		Assert.assertEquals(1500.0, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
		
		funcionario =  new Funcionario("nome", "email@fake.com", 2001, new Testador());
		Assert.assertEquals(1500.75, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
	}
	
	@Test
	public void testeCalcSalarioGerente(){
		funcionario =  new Funcionario("nome", "email@fake.com", 4000 , new Gerente());
		Assert.assertEquals(3200.0, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
		
		funcionario =  new Funcionario("nome", "email@fake.com", 5000, new Gerente());
		Assert.assertEquals(3500.0, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
		
		funcionario =  new Funcionario("nome", "email@fake.com", 5001, new Gerente());
		Assert.assertEquals(3500.7, calculadoraDeSalario.calculaSalario(funcionario), 0.1);
	}
}