package geradorNF.main;

import geradorNF.model.Fatura;
import geradorNF.model.NotaFiscal;
import geradorNF.model.Servico;

public class GeradorNotaFiscal {

	public NotaFiscal gerarNF(String cliente, String endereco, double valor, Servico servico) throws Exception {
		Fatura fatura = new Fatura(cliente, endereco, valor, servico);
		NotaFiscal nf = new NotaFiscal(fatura);
		
		NotaFiscalDao.salva(nf);
		SAP.envia(nf);
		Smtp.envia(nf);
		return nf;
	}
}
