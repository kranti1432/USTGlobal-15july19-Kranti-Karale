package com.ust.ustspring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ust.ustspring.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDAo {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addEmployee(Employee employee) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean removeEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Employee employee;
		transaction.begin();
		employee = manager.find(Employee.class, id);
		try {
			manager.remove(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Employee employee2;
		transaction.begin();
		employee2 = manager.find(Employee.class, employee.getId());
		try {
			employee2.setName(employee.getName());
			employee2.setPassword(employee.getPassword());
			employee2.setDob(employee.getDob());
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Employee getEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		try {
			Employee employee;
			employee = manager.find(Employee.class, id);
			return employee;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql = "from Employee";
		Query query = manager.createQuery(jpql);
		List<Employee> employees = query.getResultList();
		return employees;
	}

}
