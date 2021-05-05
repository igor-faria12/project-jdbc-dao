package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;



public class DepartmentTest {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=======TEST 1: Department findById======");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
	
		/*System.out.println("=======TEST 2: Department insert======");
		dep = new Department();
		dep.setName("D1");
		departmentDao.insert(dep);
		System.out.println(dep);
		
		System.out.println("=======TEST 3: Department delete======");
		departmentDao.deleteById(14);
		
		dep = new Department(7, "DD");
		System.out.println("=======TEST 4: Department update======");
		departmentDao.update(dep);
		System.out.println(dep);*/
		
		System.out.println("=======TEST 2: Department findALL======");
		List<Department> list = departmentDao.findAll();
		
		for(Department d: list)
			System.out.println(d);

	}

}
