package model;

import java.sql.Date;

public class Estoque extends Model {
	private Long codEstoque;
	private Date dataAtualizacao;

	public Estoque(Long codEstoque, Date dataAtualizacao) {
		super();
		this.codEstoque = codEstoque;
		this.dataAtualizacao = dataAtualizacao;
	}

	public Long getCodEstoque() {
		return codEstoque;
	}

	public void setCodEstoque(Long codEstoque) {
		this.codEstoque = codEstoque;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}
