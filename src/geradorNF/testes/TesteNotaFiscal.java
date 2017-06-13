package geradorNF.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import geradorNF.model.CONSULTORIA;
import geradorNF.model.Fatura;
import geradorNF.model.NotaFiscal;
import geradorNF.model.OUTROS;
import geradorNF.model.TREINAMENTO;

public class TesteNotaFiscal {

	@Test
	public void testCreateNotaFiscal() {
		
		Fatura fatura = null;
		NotaFiscal nf = null;
		
		try{
			fatura = new Fatura("Luiz", "Rua Z", 10, CONSULTORIA.getServico());
			nf = new NotaFiscal(fatura);
		} catch(Exception e){
			fail();
		}
		
		assertEquals("Luiz", nf.getCliente());
		assertEquals(10, nf.getValor(), 0.0001d);
		assertEquals(2.5, nf.getImposto(), 0.0001d);
		
		try{
			fatura = new Fatura("Luiz", "Rua Z", 10, TREINAMENTO.getServico());
			nf = new NotaFiscal(fatura);
		} catch(Exception e){
			fail();
		}
		
		assertEquals("Luiz", nf.getCliente());
		assertEquals(10, nf.getValor(), 0.0001d);
		assertEquals(1.5, nf.getImposto(), 0.0001d);
		
		try{
			fatura = new Fatura("Luiz", "Rua Z", 10, OUTROS.getServico());
			nf = new NotaFiscal(fatura);
		} catch(Exception e){
			fail();
		}
		
		assertEquals("Luiz", nf.getCliente());
		assertEquals(10, nf.getValor(), 0.0001d);
		assertEquals(0.6, nf.getImposto(), 0.0001d);
	}
	
	@Test
	public void testCreateNotaFiscalValorZero() {
		
		Fatura fatura = null;
		NotaFiscal nf = null;
		
		try {
			fatura = new Fatura("Luiz", "Rua Z", 0, CONSULTORIA.getServico());
			nf = new NotaFiscal(fatura);
		} catch (Exception e) {
			fail();
		}
		
		assertEquals("Luiz", nf.getCliente());
		assertEquals(0, nf.getValor(), 0.0001d);
		assertEquals(0, nf.getImposto(), 0.0001d);
		
		
		try {
			fatura = new Fatura("Luiz", "Rua Z", 0, TREINAMENTO.getServico());
			nf = new NotaFiscal(fatura);
		} catch (Exception e) {
			fail();
		}
		
		assertEquals("Luiz", nf.getCliente());
		assertEquals(0, nf.getValor(), 0.0001d);
		assertEquals(0, nf.getImposto(), 0.0001d);
		
		try{
			fatura = new Fatura("Luiz", "Rua Z", 0, OUTROS.getServico());
			nf = new NotaFiscal(fatura);
		} catch(Exception e){
			fail();
		}
		
		assertEquals("Luiz", nf.getCliente());
		assertEquals(0, nf.getValor(), 0.0001d);
		assertEquals(0, nf.getImposto(), 0.0001d);
	}

}
