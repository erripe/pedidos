package model;

import java.math.BigDecimal;

public class ItemsVendas {
	private Venda venda;
	private Produto produto;
	private BigDecimal qtdVenda;

	public ItemsVendas(Venda venda, Produto produto, BigDecimal qtdVenda) {
		super();
		this.venda = venda;
		this.produto = produto;
		this.qtdVenda = qtdVenda;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public BigDecimal getQtd() {
		return qtdVenda;
	}

	public void setQtd(BigDecimal qtdVenda) {
		this.qtdVenda = qtdVenda;
	}

	@Override
	public String toString() {
		return "ItemsVendas [venda=" + venda + ", produto=" + produto + ", qtd=" + qtdVenda + "]";
	}

}
