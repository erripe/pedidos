package model;

import java.math.BigDecimal;
import java.util.Date;

public class Venda extends Model {
	private Long codVenda;
	private Comanda comanda;
	private BigDecimal precoTotal;
	private Date dataVenda;
	private EStatusVenda vldStatusVenda;

	public Venda(Long codVenda, Comanda comanda, BigDecimal precoTotal, Date dataVenda, EStatusVenda vldStatusVenda) {
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

	public EStatusVenda getVldStatusVenda() {
		return vldStatusVenda;
	}

	public void setVldStatusVenda(EStatusVenda vldStatusVenda) {
		this.vldStatusVenda = vldStatusVenda;
	}

	private enum EStatusVenda {
		ABERTA(0), PAGA(1);

		private int value;

		public int getValue() {
			return this.value;
		}

		private EStatusVenda(int i) {
			this.value = i;
		}
	}

}
