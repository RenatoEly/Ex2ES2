package calSalario;

import org.junit.Assert;
import org.junit.Test;

public class TesteCargo {

	@Test
	public void testeDesenvolvedor() {
		Cargo cargo = new Desenvolvedor();
		Assert.assertEquals(200, cargo.calculaDesconto(2000),0.1);
		Assert.assertEquals(600, cargo.calculaDesconto(3000),0);
		Assert.assertEquals(600.2, cargo.calculaDesconto(3001),0);
	}
	
	@Test
	public void testeDBA(){
		Cargo cargo = new DBA();
		Assert.assertEquals(150, cargo.calculaDesconto(1000),0);
		Assert.assertEquals(500, cargo.calculaDesconto(2000),0);
		Assert.assertEquals(500.25, cargo.calculaDesconto(2001),0);
	}
	
	@Test
	public void testeTestador(){
		Cargo cargo = new Testador();
		Assert.assertEquals(150, cargo.calculaDesconto(1000),0);
		Assert.assertEquals(500, cargo.calculaDesconto(2000),0);
		Assert.assertEquals(500.25, cargo.calculaDesconto(2001),0);
	}
	
	@Test
	public void testeGerente(){
		Cargo cargo = new Gerente();
		Assert.assertEquals(800, cargo.calculaDesconto(4000),0);
		Assert.assertEquals(1500, cargo.calculaDesconto(5000),0);
		Assert.assertEquals(1500.3, cargo.calculaDesconto(5001),0);
	}
}