package geradorNF.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import geradorNF.model.CONSULTORIA;
import geradorNF.model.Fatura;
import geradorNF.model.OUTROS;
import geradorNF.model.TREINAMENTO;

public class TesteFatura {

	@Test
	public void testCreateFatura() {
		
		Fatura fatura = null;
		
		try {
			fatura = new Fatura("Renato","Rua X",199.9, CONSULTORIA.getServico());
		} catch (Exception e) {
			fail();
		}
		assertEquals("Renato", fatura.getCliente());
		assertEquals("Rua X", fatura.getEndereco());
		assertEquals(CONSULTORIA.getServico(), fatura.getTipoServico());
		assertEquals(199.9, fatura.getvalor(), 0.0001);
		
		
		try {
			fatura = new Fatura("Renato","Rua X",199.9, TREINAMENTO.getServico());
		} catch (Exception e) {
			fail();
		}
		assertEquals("Renato", fatura.getCliente());
		assertEquals("Rua X", fatura.getEndereco());
		assertEquals(TREINAMENTO.getServico(), fatura.getTipoServico());
		assertEquals(199.9f, fatura.getvalor(), 0.0001);
		
		
		try {
			fatura = new Fatura("Renato","Rua X",199.9, OUTROS.getServico());
		} catch (Exception e) {
			fail();
		}
		assertEquals("Renato", fatura.getCliente());
		assertEquals("Rua X", fatura.getEndereco());
		assertEquals(OUTROS.getServico(), fatura.getTipoServico());
		assertEquals(199.9f, fatura.getvalor(), 0.0001);
	}
	
	@Test
	public void testCreateFaturaZero() {
		
		Fatura fatura = null;
		try {
			fatura = new Fatura("Renato","Rua X",0, CONSULTORIA.getServico());
		} catch (Exception e) {
			fail();
		}
		assertEquals("Renato", fatura.getCliente());
		assertEquals("Rua X", fatura.getEndereco());
		assertEquals(CONSULTORIA.getServico(), fatura.getTipoServico());
		assertEquals(0, fatura.getvalor(), 0.0001);
		
		
		try {
			fatura = new Fatura("Renato","Rua X",0, TREINAMENTO.getServico());
		} catch (Exception e) {
			fail();
		}
		assertEquals("Renato", fatura.getCliente());
		assertEquals("Rua X", fatura.getEndereco());
		assertEquals(TREINAMENTO.getServico(), fatura.getTipoServico());
		assertEquals(0, fatura.getvalor(), 0.0001);
		
		
		try {
			fatura = new Fatura("Renato","Rua X",0, OUTROS.getServico());
		} catch (Exception e) {
			fail();
		}
		assertEquals("Renato", fatura.getCliente());
		assertEquals("Rua X", fatura.getEndereco());
		assertEquals(OUTROS.getServico(), fatura.getTipoServico());
		assertEquals(0, fatura.getvalor(), 0.0001);
	}
	
	@Test
	public void testCreateFaturaNegativa() {
		
		Fatura fatura = null;
		try{
			fatura = new Fatura("Renato","Rua X",-1, CONSULTORIA.getServico());
			fail("Deveria ter lançado exceção");
		}catch(Exception e){
			
		}
		
		try{
			fatura = new Fatura("Renato","Rua X",-1, TREINAMENTO.getServico());
			fail("Deveria ter lançado exceção");
		}catch(Exception e){
			
		}
		
		try{
			fatura = new Fatura("Renato","Rua X",-1, OUTROS.getServico());
			fail("Deveria ter lançado exceção");
		}catch(Exception e){
		
		}
	}
}
