package model;

public class Comanda {
	private Long codComanda;
	private vldStatusComanda vldLivre;

	public Comanda(Long codComanda, vldStatusComanda vldLivre) {
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

	public vldStatusComanda getVldLivre() {
		return vldLivre;
	}

	public void setVldLivre(vldStatusComanda vldLivre) {
		this.vldLivre = vldLivre;
	}

	private enum vldStatusComanda {
		LIVRE(0), OCUPADA(1);

		private int value;

		public int getValue() {
			return this.value;
		}

		private vldStatusComanda(int i) {
			this.value = i;
		}
	}

	@Override
	public String toString() {
		return "Comanda [codComanda=" + codComanda + ", vldLivre=" + vldLivre + "]";
	}

}
