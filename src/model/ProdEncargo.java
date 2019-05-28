package model;

import java.util.ArrayList;

public class ProdEncargo extends Model {
	private Produto produto;
	private ArrayList<Encargo> list;

	public ProdEncargo(Produto produto, ArrayList<Encargo> list) {
		super();
		this.produto = produto;
		this.list = list;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public ArrayList<Encargo> getList() {
		return list;
	}

	public void setList(ArrayList<Encargo> list) {
		this.list = list;
	}

}
