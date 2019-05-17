package model;

import java.math.BigDecimal;
import java.util.Date;

public class Venda {
	private Long codVenda;
	private Comanda comanda;
	private BigDecimal precoTotal;
	private Date dataVenda;
	private VldStatusVenda vldStatusVenda;

	public Venda(Long codVenda, Comanda comanda, BigDecimal precoTotal, Date dataVenda, VldStatusVenda vldStatusVenda) {
		super();
		this.codVenda = codVenda;
		this.comanda = comanda;
		this.precoTotal = precoTotal;
		this.dataVenda = dataVenda;
		this.vldStatusVenda = vldStatusVenda;
	}

	public Long getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(Long codVenda) {
		this.codVenda = codVenda;
	}

	public Comanda getComanda() {
		return comanda;
	}

	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}

	public BigDecimal getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(BigDecimal precoTotal) {
		this.precoTotal = precoTotal;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public VldStatusVenda getVldStatusVenda() {
		return vldStatusVenda;
	}

	public void setVldStatusVenda(VldStatusVenda vldStatusVenda) {
		this.vldStatusVenda = vldStatusVenda;
	}

	@Override
	public String toString() {
		return "Venda [codVenda=" + codVenda + ", comanda=" + comanda + ", precoTotal=" + precoTotal + ", dataVenda="
				+ dataVenda + ", vldStatusVenda=" + vldStatusVenda + "]";
	}

	private enum VldStatusVenda {
		ABERTA(0), PAGA(1);

		private int value;

		public int getValue() {
			return this.value;
		}

		private VldStatusVenda(int i) {
			this.value = i;
		}
	}

}
