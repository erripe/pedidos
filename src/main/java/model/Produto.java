package model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

import model.DAO.ProdutoDAO;

@Entity
@Table(appliesTo = "Produto")
public class Produto extends Model {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codProd;

	@Column
	private String descProd;

	@Column
	private BigDecimal valorCompra;

	@Column
	private Long codFornecedor;

	public Produto() {
		super();
	}

	// ------------------------------------------------

	public static List<Produto> findList(String codProd, String descProd) throws Exception {
		return ProdutoDAO.findList(codProd, descProd);
	}

	public static Produto findById(Long codProd) throws Exception {
		return ProdutoDAO.findById(codProd);
	}

	public boolean insert() throws Exception {
		return ProdutoDAO.insert(this);
	}

	public boolean update() throws Exception {
		return ProdutoDAO.update(this);
	}

	public boolean delete() throws Exception {
		return ProdutoDAO.delete(this);
	}

	// ------------------------------------------------

	public Long getCodProd() {
		return codProd;
	}

	public void setCodProd(Long codProd) {
		this.codProd = codProd;
	}

	public String getDescProd() {
		return descProd;
	}

	public void setDescProd(String descProd) {
		this.descProd = descProd;
	}

	public BigDecimal getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Long getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(Long codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

	@Override
	public String toString() {
		return "Produto [codProd=" + codProd + ", descProd=" + descProd + ", valorCompra=" + valorCompra
				+ ", codFornecedor=" + codFornecedor + "]";
	}

}
