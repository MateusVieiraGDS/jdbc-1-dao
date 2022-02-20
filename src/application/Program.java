package application;

import java.util.Date;
import java.util.List;

import db.DB;
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
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();		
		/*
		System.out.println("\nTEST #1: Department insert");		
		Department dep = new Department();
		dep.setName("Marketing");
		departmentDao.insert(dep);
		System.out.println("Insert Department: " + dep);
		
		
		System.out.println("\nTEST #2: Department update");
		Department dep = new Department();
		dep.setId(5);
		dep.setName("Logistic");
		int rowsaff = departmentDao.update(dep);
		System.out.println("Update Department! rows affected = " + rowsaff);
		
		*/
		System.out.println("\nTEST #3: Department delete");
		int rowsaff = departmentDao.deleteById(5);
		System.out.println("Delete Department! rows affected = " + rowsaff);
		
		System.out.println("\nTEST #4: Department findById");
		System.out.println("Find department: " + departmentDao.findById(2));
		
		System.out.println("\nTEST #4: Department findAll");
		for(Department dep : departmentDao.findAll())
			System.out.println("Find department: " + dep);
		
		DB.closeConnection();		
	}

}
