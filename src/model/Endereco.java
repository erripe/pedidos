package model;

public class Endereco {
	private Long codEndereco;
	private String cep;
	private String logadouro;
	private String num;
	private String uf;
	private String pais;
	private String bairro;
	private String cidade;

	public Endereco(Long codEndereco, String cep, String logadouro, String num, String uf, String pais, String bairro,
			String cidade) {
		super();
		this.codEndereco = codEndereco;
		this.cep = cep;
		this.logadouro = logadouro;
		this.num = num;
		this.uf = uf;
		this.pais = pais;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Long getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(Long codEndereco) {
		this.codEndereco = codEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogadouro() {
		return logadouro;
	}

	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [codEndereco=" + codEndereco + ", cep=" + cep + ", logadouro=" + logadouro + ", num=" + num
				+ ", uf=" + uf + ", pais=" + pais + ", bairro=" + bairro + ", cidade=" + cidade + "]";
	}

}
