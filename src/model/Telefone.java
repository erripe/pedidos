package model;

import java.util.ArrayList;

public class Telefone {
	private Long codTelefone;
	private Fornecedor fornecedor;
	private ArrayList<TelefoneDados> list;

	public Telefone(Long codTelefone, Fornecedor fornecedor, ArrayList<TelefoneDados> list) {
		super();
		this.codTelefone = codTelefone;
		this.fornecedor = fornecedor;
		this.list = list;
	}

	public Long getCodTelefone() {
		return codTelefone;
	}

	public void setCodTelefone(Long codTelefone) {
		this.codTelefone = codTelefone;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public ArrayList<TelefoneDados> getList() {
		return list;
	}

	public void setList(ArrayList<TelefoneDados> list) {
		this.list = list;
	}

}
