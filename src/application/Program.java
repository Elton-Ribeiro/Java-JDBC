package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		//Department obj = new Department(1, "Books");
		//Seller seller = new Seller(21, "Bob", "bob@mail.com", new Date(), 3000.0, obj);
		
		new DaoFactory();
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("\n=== TESTE 1 - SELLER FIND BY ID ===");
		Seller seller = sellerDao.findById(3); 	
		System.out.println(seller);
		
		System.out.println("\n=== TESTE 2 - SELLER FIND BY DEPARTMENT ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 3 - SELLER FIND BY ALL ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
//		System.out.println("\n=== TESTE 4 - INSERT NEW SELLER ===");
//		Seller newSeller = new Seller(null, "Rick Sanchez", "sanchez@email.com", new Date(), 500.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = " + newSeller.getId());
//		
//		System.out.println("\n=== TESTE 5 - SELLER UPDATE ===");
//		seller = sellerDao.findById(1);
//		seller.setName("Bobby Brown");
//		seller.setEmail("500dol@email.com");
//		sellerDao.update(seller);
//		System.out.println("UPDATE COMPLETED");
		
		System.out.println("\n=== TESTE 6 - SELLER DELETE ===");
		seller = sellerDao.findById(15);
		System.out.println(seller);
		sellerDao.deleteById(15);
		System.out.println("DELETE COMPLETED");
	}

}
