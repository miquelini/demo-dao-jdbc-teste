package model.dao;

import model.dao.impl.SellerDaoImJDBC;

public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoImJDBC();
	}

}
