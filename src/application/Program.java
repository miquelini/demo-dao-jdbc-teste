package application;

import java.util.Date;
import java.util.List;

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
		Seller seller1 = sellerDao.findById(3);
		System.out.print(seller1);		

		System.out.println("\n\n====== Teste 2: Seller findByDepartment =======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj2 : list) {
			System.out.println(obj2);
		}

		System.out.println("\n\n====== Teste 3: Seller findAll =======");
		list = sellerDao.findAll();
		for (Seller obj2 : list) {
			System.out.println(obj2);
		}


	}

}
