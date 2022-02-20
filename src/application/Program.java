package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("TEST #1: Seller.findById(3):");		
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		System.out.println("\nTEST #2: Seller.findByDepartment(2):");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
		for(Seller sel : list)
			System.out.println(sel);
		
		System.out.println("\nTEST #3: Seller.findAll():");
		list = sellerDao.findAll();
		for(Seller sel : list)
			System.out.println(sel);
		
		System.out.println("\nTEST #4: Seller Insert");
		seller = new Seller(null, "Bernardo", "ber@uol.com.br", new Date(), 3200.0, new Department(3, null));
		sellerDao.insert(seller);
		System.out.println("Inserted! New id = " + seller.getId());
	}

}
