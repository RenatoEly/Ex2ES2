package geradorNF.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import geradorNF.main.GeradorNotaFiscal;
import geradorNF.model.CONSULTORIA;
import geradorNF.model.Fatura;
import geradorNF.model.NotaFiscal;
import geradorNF.model.OUTROS;
import geradorNF.model.TREINAMENTO;

public class TesteGeradorNF {

	@Test
	public void test() {
		GeradorNotaFiscal gerador = new GeradorNotaFiscal();
		
		try {
			assertEquals(new NotaFiscal(new Fatura("João", "", 0, CONSULTORIA.getServico())),
					gerador.gerarNF("João", "", 0, CONSULTORIA.getServico()));
		} catch (Exception e) {
			fail();
		}
		
		try {
			assertEquals(new NotaFiscal(new Fatura("João", "", 0, TREINAMENTO.getServico())),
					gerador.gerarNF("João", "", 0, TREINAMENTO.getServico()));
		} catch (Exception e) {
			fail();
		}
		
		try {
			assertEquals(new NotaFiscal(new Fatura("João", "", 0, OUTROS.getServico())),
					gerador.gerarNF("João", "", 0, OUTROS.getServico()));
		} catch (Exception e) {
			fail();
		}
	}
}
