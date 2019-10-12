package com.tyss.usttyspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tyss.usttyspringmvc.dto.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public Employee auth(String email, String password) {
		String jpql="From Employee where email=:email and password=:password";
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		Employee employee;
		try {
			return (Employee) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}
	@Override
	public boolean registerEmployee(Employee employee) {
		if(checkEmail(employee.getEmail())) {
			return false;
		}
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		return true;
	}

	//for email check
	private boolean checkEmail(String email) {
		String jpql="from Employee where email=:email";
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery(jpql);
		query.setParameter("email", email);
		try {
			query.getSingleResult();
			return true  ;
		} catch (Exception e) {
			return false;
		}



	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Employee employee=manager.find(Employee.class, id);
		if(employee==null) {
			return false;
		}
		manager.remove(employee);
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Employee emp=manager.find(Employee.class, employee.getId());
		if(emp==null) {
			return false;
		}else {
		emp.setPassword(employee.getPassword());
		emp.setName(employee.getName());
		emp.setDob(employee.getDob());
		transaction.begin();
		manager.persist(emp);
		transaction.commit();
		return true;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		String jpql="from Employee";
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery(jpql);
		List<Employee> employees=query.getResultList();
		return employees;
	}

}
