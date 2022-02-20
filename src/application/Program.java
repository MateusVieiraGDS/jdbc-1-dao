package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		/*
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
		
		
		System.out.println("\nTEST #5: Seller Updade");
		seller = new Seller(10, "Cleiton", "clet0@gmail.com", new Date(), 2200.0, new Department(2, null));
		int rowsaff = sellerDao.update(seller);
		System.out.println("Update! affected rows = " + rowsaff);
		
		System.out.println("\nTEST #6: Seller delete");
		rowsaff = sellerDao.deleteById(8);
		System.out.println("Update! affected rows = " + rowsaff);
		*/
		
		System.out.println("\nTEST #1: Department insert");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = new Department();
		dep.setName("Marketing");
		departmentDao.insert(dep);
		System.out.println("Insert Department: " + dep);
	}

}
