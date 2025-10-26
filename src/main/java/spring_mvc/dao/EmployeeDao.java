package spring_mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.mysql.cj.Query;

import spring_mvc.dto.Employee;

@Component
public class EmployeeDao {
  
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public String insert(Employee employee ) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return "Employee Added";
	}
	
	public Object findById(int id) {
		Employee employee=entityManager.find(Employee.class, id);
		if(employee==null) {
			return "no data found with id"+" "+id;
		}
		else {
			return employee;
		}
	}
	
	public String delbyId(int id) {
	      Employee employee=entityManager.find(Employee.class, id);
	      if(employee==null) {
	    	  return "NO data found for the id "+id;
	      }else {
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
		return "Emp with "+id+" deleted successfully";
	      }
	}
	public List<Employee> fetchall(){
		javax.persistence.Query query=entityManager.createQuery("select a from Employee a");
		List<Employee>  list =query.getResultList();
		System.out.println(list);
		return list;
		
	}
	public String deleteAll() {
		javax.persistence.Query query=entityManager.createQuery("Select a from Employee a");
		List<Employee> list =query.getResultList();
		if(list.isEmpty()) {
			return "No data Found";
		}
		else {
			for(Employee e:list) {
				entityTransaction.begin();
				entityManager.remove(e);
				entityTransaction.commit();
				
			}
			return "Data deleted";
		}
	}
	public String update(Employee employee) {
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return "Account updated";
		
		
	}

}
