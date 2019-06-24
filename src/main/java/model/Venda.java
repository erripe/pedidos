package model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

import model.DAO.VendaDAO;

@Entity
@Table(appliesTo = "Venda")
public class Venda extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long codVenda;

	@Column
	private Long codComanda;

	@Column
	private BigDecimal precoTotal;

	@Column
	private Date dataVenda;

	@Column
	private Long vldStatusVenda;

	// ------------------------------------------------

	public static List<Venda> findList() throws Exception {
		return VendaDAO.findList();
	}

	public static List<Venda> findListComanda(Long codComanda) throws Exception {
		return VendaDAO.findListComanda(codComanda);
	}

	public static Venda findById(Long codVenda) throws Exception {
		return VendaDAO.findById(codVenda);
	}

	public boolean insert() throws Exception {
		return VendaDAO.insert(this);
	}

	public boolean update() throws Exception {
		return VendaDAO.update(this);
	}

	public boolean delete() throws Exception {
		return VendaDAO.delete(this);
	}

	// ------------------------------------------------

	public Venda() {
		super();
	}

	public Long getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(Long codVenda) {
		this.codVenda = codVenda;
	}

	public Long getCodComanda() {
		return codComanda;
	}

	public void setCodComanda(Long codComanda) {
		this.codComanda = codComanda;
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

	public Long getVldStatusVenda() {
		return vldStatusVenda;
	}

	public void setVldStatusVenda(Long vldStatusVenda) {
		this.vldStatusVenda = vldStatusVenda;
	}

	@SuppressWarnings("unused")
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
