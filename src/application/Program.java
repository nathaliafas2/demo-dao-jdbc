package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		//Department obj = new Department(1, "Books");
		//System.out.println(obj);	
		
		//Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("==== TESTE 1: Seller findById ====");
		
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);	
		
		System.out.println("\n==== TESTE 2: Seller findByDepartment ====");
		Department dep = new Department(2,null);
		List<Seller> listSeller = sellerDao.findByDepartment(dep);
		
		for (Seller sel : listSeller) {
			System.out.println(sel);	
		}
		
	}
}
