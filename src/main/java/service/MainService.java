package service;

import java.util.List;

import model.Produto;

public class MainService {

	public List<Produto> produtoFindList(String codProd, String descProd) throws Exception {

		return Produto.findList(codProd, descProd);
	}

	public boolean produtoDel(Produto selectedItem) throws Exception {

		return selectedItem.delete();
	}

	public boolean produtoInsert(Produto prd) throws Exception {
		return prd.insert();
	}

	public boolean produtoEdit(Produto prd) throws Exception {
		return prd.update();
	}

}
