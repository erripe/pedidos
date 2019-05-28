package model;

public class Fornecedor extends Model {
	private Long codFornecedor;
	private String descFornecedor;
	private String cnpj;
	private String email;
	private Endereco endereco;

	public Fornecedor(Long codFornecedor, String cnpj, String descFornecedor, String email,
			Endereco endereco) {
		super();
		this.codFornecedor = codFornecedor;
		this.cnpj = cnpj;
		this.descFornecedor = descFornecedor;
		this.email = email;
		this.endereco = endereco;
	}

	public Long getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(Long codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDescFornecedor() {
		return descFornecedor;
	}

	public void setDescFornecedor(String descFornecedor) {
		this.descFornecedor = descFornecedor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
