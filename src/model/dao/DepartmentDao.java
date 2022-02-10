package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface DepartmentDao {

	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer obj);
	void findById(Integer obj);
	List<Department> findAll();
	// List<Department> findBySeller(Seller seller);

	
	
}
