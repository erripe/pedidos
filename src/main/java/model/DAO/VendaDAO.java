package model.DAO;

import java.util.List;

import model.Venda;

public class VendaDAO extends ModelDAO {

	public VendaDAO() {
	}

	@SuppressWarnings("unchecked")
	public static List<Venda> findList() throws Exception {
		VendaDAO dao = new VendaDAO();
		return ModelDAO.cast(dao.executeFindList("", new Venda()));
	}

	public static Venda findById(Long codVenda) throws Exception {
		VendaDAO dao = new VendaDAO();
		return (Venda) dao.executeFindById(Venda.class, codVenda);
	}

	public static boolean insert(Venda obj) throws Exception {
		VendaDAO dao = new VendaDAO();
		return dao.executeInsert(obj);
	}

	public static boolean update(Venda obj) throws Exception {
		VendaDAO dao = new VendaDAO();
		return dao.executeUpdate(obj);
	}

	public static boolean delete(Venda obj) throws Exception {
		VendaDAO dao = new VendaDAO();
		return dao.executeDelete(obj);
	}

}
