package model;

import annotation.Field;

public class Comanda extends Model {

	@Field(field = "COD_COMANDA")
	private Long codComanda;
	private EStatusComanda vldLivre;

	public Comanda(Long codComanda, EStatusComanda vldLivre) {
		super();
		this.codComanda = codComanda;
		this.vldLivre = vldLivre;
	}

	public Long getCodComanda() {
		return codComanda;
	}

	public void setCodComanda(Long codComanda) {
		this.codComanda = codComanda;
	}

	public EStatusComanda getVldLivre() {
		return vldLivre;
	}

	public void setVldLivre(EStatusComanda vldLivre) {
		this.vldLivre = vldLivre;
	}

	private enum EStatusComanda {
		LIVRE(0), OCUPADA(1);

		private int value;

		public int getValue() {
			return this.value;
		}

		private EStatusComanda(int i) {
			this.value = i;
		}
	}

}
