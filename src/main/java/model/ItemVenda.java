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
	private String descProd;

	@Column
	private Long qtdVenda;

	@Column
	private BigDecimal valor;

	public ItemVenda() {
		super();
	}

	// ------------------------------------------------

	public static List<ItemVenda> findList() throws Exception {
		return ItemVendaDAO.findList();
	}

	public static List<ItemVenda> findListVenda(Long codVenda) throws Exception {
		return ItemVendaDAO.findListVenda(codVenda);
	}

	public static List<ItemVenda> findById(Long codVenda, Long codProduto) throws Exception {
		return ItemVendaDAO.findById(codVenda, codProduto);
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

	public Long getQtdVenda() {
		return qtdVenda;
	}

	public void setQtdVenda(Long qtdVenda) {
		this.qtdVenda = qtdVenda;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescProd() {
		return descProd;
	}

	public void setDescProd(String descProd) {
		this.descProd = descProd;
	}

}
