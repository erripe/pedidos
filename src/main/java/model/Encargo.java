package model;

import java.math.BigDecimal;

public class Encargo extends Model {
	private Long codEncargo;
	private BigDecimal valorEncargo;
	private String descEncargo;

	public Encargo(Long codEncargo, BigDecimal valorEncargo, String descEncargo) {
		super();
		this.codEncargo = codEncargo;
		this.valorEncargo = valorEncargo;
		this.descEncargo = descEncargo;
	}

	public Long getCodEncargo() {
		return codEncargo;
	}

	public void setCodEncargo(Long codEncargo) {
		this.codEncargo = codEncargo;
	}

	public BigDecimal getValorEncargo() {
		return valorEncargo;
	}

	public void setValorEncargo(BigDecimal valorEncargo) {
		this.valorEncargo = valorEncargo;
	}

	public String getDescEncargo() {
		return descEncargo;
	}

	public void setDescEncargo(String descEncargo) {
		this.descEncargo = descEncargo;
	}

}
