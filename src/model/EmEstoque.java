package model;

import java.math.BigDecimal;

public class EmEstoque {
	private Produto produto;
	private Estoque estoque;
	private BigDecimal qtdEmEstoque;

	public EmEstoque(Produto produto, Estoque estoque, BigDecimal qtdEmEstoque) {
		super();
		this.produto = produto;
		this.estoque = estoque;
		this.qtdEmEstoque = qtdEmEstoque;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public BigDecimal getQtdEmEstoque() {
		return qtdEmEstoque;
	}

	public void setQtdEmEstoque(BigDecimal qtdEmEstoque) {
		this.qtdEmEstoque = qtdEmEstoque;
	}

	@Override
	public String toString() {
		return "EmEstoque [produto=" + produto + ", estoque=" + estoque + ", qtdEmEstoque=" + qtdEmEstoque + "]";
	}

}
