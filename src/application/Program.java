package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");

		Seller seller = new Seller(21, "Bobs", "bob@gmail.com", new Date(), 3000.0, obj);
		// Aqui o programa sabe que existe a classe Seller mas não conhece a implementação da Classe.
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("====== Teste 1: Seller findById =======");
		
		System.out.print(seller);

		System.out.println();
		Seller seller1 = sellerDao.findById(4);
		System.out.print(seller1);
	}

}
