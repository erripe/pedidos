package model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

import model.DAO.ItemVendaDAO;

@Entity
@Table(appliesTo = "ItemVenda")
public class ItemVenda extends Model {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codItemVenda;

	@Column
	private Long codVenda;

	@Column
	private Long codProd;

	@Column
	private BigDecimal qtdVenda;

	public ItemVenda() {
		super();
	}

	// ------------------------------------------------

	public static List<ItemVenda> findList() throws Exception {
		return ItemVendaDAO.findList();
	}

	public static ItemVenda findById(Long codItemVenda) throws Exception {
		return ItemVendaDAO.findById(codItemVenda);
	}

	public boolean insert() throws Exception {
		return ItemVendaDAO.insert(this);
	}

	public boolean update() throws Exception {
		return ItemVendaDAO.update(this);
	}

	public boolean delete() throws Exception {
		return ItemVendaDAO.delete(this);
	}

	// ------------------------------------------------

	public Long getCodItemVenda() {
		return codItemVenda;
	}

	public void setCodItemVenda(Long codItemVenda) {
		this.codItemVenda = codItemVenda;
	}

	public Long getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(Long codVenda) {
		this.codVenda = codVenda;
	}

	public Long getCodProd() {
		return codProd;
	}

	public void setCodProd(Long codProd) {
		this.codProd = codProd;
	}

	public BigDecimal getQtdVenda() {
		return qtdVenda;
	}

	public void setQtdVenda(BigDecimal qtdVenda) {
		this.qtdVenda = qtdVenda;
	}
}
