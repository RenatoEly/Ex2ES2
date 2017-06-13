package calSalario;

import org.junit.Assert;
import org.junit.Test;

public class TesteFuncionario {

	@Test
	public void testeFuncionario() {
		Funcionario funcionario = new Funcionario("nome", "email@fake.com", 1000, new Desenvolvedor());
		Assert.assertEquals("nome", funcionario.getNome());
		Assert.assertEquals("email@fake.com", funcionario.getEmail());
		Assert.assertEquals(1000, funcionario.getSalario(),0);
	}
}
