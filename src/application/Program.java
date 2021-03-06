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
		System.out.println("=======TEST 1: seller findById======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=======TEST 2: seller findByDepartment======");
		Department dep = new Department(2, "name");
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=======TEST 3: seller findAll========");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		/*
		System.out.println("\n=======TEST 4: seller insert========"); 
		Seller seller2 = new Seller(null, "Greg", "Gre@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(seller2);
		System.out.println("Inserted! new id: "+ seller2.getId());*/
		
		System.out.println("\n=======TEST 5: seller update========"); 
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n=======TEST 6: seller delete========"); 
		sellerDao.deleteById(9);
		System.out.println("Delete Completed");
		
	}

}
