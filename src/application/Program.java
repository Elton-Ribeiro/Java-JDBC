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

		//Department obj = new Department(1, "Kitchen");
		//Seller seller = new Seller(21, "Sponge Bob", "squarepants@seamail.com", new Date(), 3000.0, obj);
		
		//new DaoFactory();
		//SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
//		System.out.println("\n=== TEST 1 - SELLER FIND BY ID ===");
//		Seller seller = sellerDao.findById(3); 	
//		System.out.println(seller);
//		
//		System.out.println("\n=== TEST 2 - SELLER FIND BY DEPARTMENT ===");
//		Department department = new Department(2, null);
//		List<Seller> list = sellerDao.findByDepartment(department);
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("\n=== TEST 3 - SELLER FIND BY ALL ===");
//		list = sellerDao.findAll();
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("\n=== TEST 4 - INSERT NEW SELLER ===");
//		Seller newSeller = new Seller(null, "Rick Sanchez", "wearedust@galaxymail.com", new Date(), 1600.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = " + newSeller.getId());
//		
//		System.out.println("\n=== TEST 5 - SELLER UPDATE ===");
//		seller = sellerDao.findById(1);
//		seller.setName("Bobby Brown");
//		seller.setEmail("500dol@email.com");
//		sellerDao.update(seller);
//		System.out.println("UPDATE COMPLETED");
//		
//		System.out.println("\n=== TEST 6 - SELLER DELETE ===");
//		seller = sellerDao.findById(15);
//		System.out.println(seller);
//		sellerDao.deleteById(15);
//		System.out.println("DELETE COMPLETED");
		
		// DEPARTMENT		
		
		new DaoFactory(); //APAGAR DEPOIS
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		
		
		System.out.println("=== TEST 7 - findById =======");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 8 - findAll =======");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

		System.out.println("\n=== TEST 9 - insert =======");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());

		System.out.println("\n=== TEST 10 - update =======");
		Department dep1 = departmentDao.findById(3);
		dep1.setName("Camping");
		departmentDao.update(dep1);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 11: delete =======");		
		departmentDao.deleteById(1);
		System.out.println("Delete completed");
		
		
	}

}
