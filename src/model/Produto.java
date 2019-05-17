package model;

import java.math.BigDecimal;

public class Produto {
	private Long codProduto;
	private String descProduto;
	private BigDecimal valorCompra;
	private Fornecedor fornecedor;

	public Produto(Long codProduto, String descProduto, BigDecimal valorCompra, Fornecedor fornecedor) {
		super();
		this.codProduto = codProduto;
		this.descProduto = descProduto;
		this.valorCompra = valorCompra;
		this.fornecedor = fornecedor;
	}

	public Long getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Long codProduto) {
		this.codProduto = codProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public BigDecimal getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public String toString() {
		return "Produto [codProduto=" + codProduto + ", descProduto=" + descProduto + ", valorCompra=" + valorCompra
				+ ", fornecedor=" + fornecedor + "]";
	}

}
