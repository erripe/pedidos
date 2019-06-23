package model.DAO;

import java.util.List;

import model.Comanda;

public class ComandaDAO extends ModelDAO {

	public ComandaDAO() {
	}

	@SuppressWarnings("unchecked")
	public static List<Comanda> findList() throws Exception {
		ComandaDAO dao = new ComandaDAO();
		return ModelDAO.cast(dao.executeFindList("", new Comanda()));
	}

	public static Comanda findById(Long codComanda) throws Exception {
		ComandaDAO dao = new ComandaDAO();
		return (Comanda) dao.executeFindById(Comanda.class, codComanda);
	}

	public static boolean insert(Comanda obj) throws Exception {
		ComandaDAO dao = new ComandaDAO();
		return dao.executeInsert(obj);
	}

	public static boolean update(Comanda obj) throws Exception {
		ComandaDAO dao = new ComandaDAO();
		return dao.executeUpdate(obj);
	}

	public static boolean delete(Comanda obj) throws Exception {
		ComandaDAO dao = new ComandaDAO();
		return dao.executeDelete(obj);
	}

}
