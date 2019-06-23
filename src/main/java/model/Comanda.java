package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

import model.DAO.ComandaDAO;

@Entity
@Table(appliesTo = "Comanda")
public class Comanda extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long codComanda;

	@Column
	private Long vldLivre;

	public Comanda() {
		super();
	}

	public Long getCodComanda() {
		return codComanda;
	}

	public void setCodComanda(Long codComanda) {
		this.codComanda = codComanda;
	}

	public Long getVldLivre() {
		return vldLivre;
	}

	public void setVldLivre(Long vldLivre) {
		this.vldLivre = vldLivre;
	}

	// ------------------------------------------------

	public static List<Comanda> findList() throws Exception {
		return ComandaDAO.findList();
	}

	public static Comanda findById(Long codComanda) throws Exception {
		return ComandaDAO.findById(codComanda);
	}

	public boolean insert() throws Exception {
		return ComandaDAO.insert(this);
	}

	public boolean update() throws Exception {
		return ComandaDAO.update(this);
	}

	public boolean delete() throws Exception {
		return ComandaDAO.delete(this);
	}

	// ------------------------------------------------

	private enum EnumStatusComanda {
		LIVRE(0), OCUPADA(1);

		private int value;

		public int getValue() {
			return this.value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		private EnumStatusComanda(int i) {
			this.value = i;
		}
	}
}
