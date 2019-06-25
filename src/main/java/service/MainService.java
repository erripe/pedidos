package service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.ItemVenda;
import model.Produto;
import model.Venda;

public class MainService {

	public List<ItemVenda> vendaFindList(Long codComanda) throws Exception {
		List<Venda> list = Venda.findListComanda(codComanda);

		if (list.isEmpty()) {
			Venda newVenda = new Venda();
			newVenda.setCodComanda(codComanda);
			newVenda.setVldStatusVenda(0L);
			newVenda.insert();
			return new ArrayList<ItemVenda>();
		}

		if (list.size() > 1) {
			throw new Exception("Erro, existe mais de uma venda em aberto para esta comanda.");
		}

		Venda venda = list.get(0);
		List<ItemVenda> items = ItemVenda.findListVenda(venda.getCodVenda());
		return items;
	}

	public boolean vendaInsertProduto(Long codComanda, Produto selectedItem) throws Exception {
		List<Venda> list = Venda.findListComanda(codComanda);
		Venda venda = list.get(0);
		List<ItemVenda> items = ItemVenda.findListVenda(venda.getCodVenda());

		for (ItemVenda itemVenda : items) {
			if (itemVenda.getCodProd() == selectedItem.getCodProd()) {
				itemVenda.setDescProd(selectedItem.getDescProd());
				itemVenda.setQtdVenda(itemVenda.getQtdVenda() + 1L);
				itemVenda.setValor(itemVenda.getValor().add(selectedItem.getValorCompra()));
				return itemVenda.update();
			}
		}

		ItemVenda iv = new ItemVenda();
		iv.setCodVenda(venda.getCodVenda());
		iv.setCodProd(selectedItem.getCodProd());
		iv.setDescProd(selectedItem.getDescProd());
		iv.setQtdVenda(1L);
		iv.setValor(selectedItem.getValorCompra());
		return iv.insert();
	}

	public boolean vendaDeletarProduto(Long codComanda, ItemVenda parm) throws Exception {
		List<Venda> list = Venda.findListComanda(codComanda);
		Venda venda = list.get(0);
		List<ItemVenda> items = ItemVenda.findListVenda(venda.getCodVenda());
		Produto selectedItem = Produto.findById(parm.getCodProd());

		for (ItemVenda itemVenda : items) {
			if (itemVenda.getCodProd() == selectedItem.getCodProd()) {
				if (itemVenda.getQtdVenda() == 1L) {
					return itemVenda.delete();
				} else {
					itemVenda.setDescProd(selectedItem.getDescProd());
					itemVenda.setQtdVenda(itemVenda.getQtdVenda() - 1L);
					itemVenda.setValor(itemVenda.getValor().subtract(selectedItem.getValorCompra()));
					return itemVenda.update();
				}
			}
		}
		return false;
	}

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

	public boolean finalizeVenda(long codComanda) throws Exception {
		List<Venda> list = Venda.findListComanda(codComanda);
		Venda v = list.get(0);
		List<ItemVenda> listItem = ItemVenda.findListVenda(v.getCodVenda());
		BigDecimal value = new BigDecimal(0);
		for (ItemVenda itemVenda : listItem) {
			BigDecimal itemValue = itemVenda.getValor();
			value = value.add(itemValue);
		}
		v.setPrecoTotal(value);
		v.setDataVenda(new Date());
		v.setVldStatusVenda(1L);
		return v.update();
	}

}
