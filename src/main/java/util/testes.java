package util;

import java.math.BigDecimal;

import model.Produto;

public class testes {
	public static void main(String[] args) throws Exception {
		Produto prd = new Produto();
		prd.setCodFornecedor(1L);
		prd.setDescProd("Maça");
		prd.setValorCompra(new BigDecimal(2.20));
		prd.insert();

		System.out.println(Produto.findList("", ""));
	}
}
