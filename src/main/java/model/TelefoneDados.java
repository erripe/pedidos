package model;

public class TelefoneDados {
	private Long codTelefoneDados;
	private String descTelefone;
	private ETipoTelefone vldTipoTelefone;

	public TelefoneDados(Long codTelefoneDados, String descTelefone, ETipoTelefone vldTipoTelefone) {
		super();
		this.codTelefoneDados = codTelefoneDados;
		this.descTelefone = descTelefone;
		this.vldTipoTelefone = vldTipoTelefone;
	}

	public Long getCodTelefone() {
		return codTelefoneDados;
	}

	public void setCodTelefone(Long codTelefoneDados) {
		this.codTelefoneDados = codTelefoneDados;
	}

	public String getDescTelefone() {
		return descTelefone;
	}

	public void setDescTelefone(String descTelefone) {
		this.descTelefone = descTelefone;
	}

	public ETipoTelefone getVldTipoTelefone() {
		return vldTipoTelefone;
	}

	public void setVldTipoTelefone(ETipoTelefone vldTipoTelefone) {
		this.vldTipoTelefone = vldTipoTelefone;
	}

	private enum ETipoTelefone {
		CELULAR(0), FIXO_CASA(1), FIXO_EMPRE(2);

		private int value;

		@SuppressWarnings("unused")
		public int getValue() {
			return this.value;
		}

		private ETipoTelefone(int i) {
			this.value = i;
		}
	}
}
