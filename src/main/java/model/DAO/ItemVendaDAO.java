package model.DAO;

import java.util.List;

import model.ItemVenda;

public class ItemVendaDAO extends ModelDAO {

	public ItemVendaDAO() {
	}

	@SuppressWarnings("unchecked")
	public static List<ItemVenda> findList() throws Exception {
		ItemVendaDAO dao = new ItemVendaDAO();
		return ModelDAO.cast(dao.executeFindList("", new ItemVenda()));
	}

	public static ItemVenda findById(Long codItemVenda) throws Exception {
		ItemVendaDAO dao = new ItemVendaDAO();
		return (ItemVenda) dao.executeFindById(ItemVenda.class, codItemVenda);
	}

	public static boolean insert(ItemVenda obj) throws Exception {
		ItemVendaDAO dao = new ItemVendaDAO();
		return dao.executeInsert(obj);
	}

	public static boolean update(ItemVenda obj) throws Exception {
		ItemVendaDAO dao = new ItemVendaDAO();
		return dao.executeUpdate(obj);
	}

	public static boolean delete(ItemVenda obj) throws Exception {
		ItemVendaDAO dao = new ItemVendaDAO();
		return dao.executeDelete(obj);
	}

}
