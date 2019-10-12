package com.dev.servelet.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.dto.EmployeeInfoBean;

public class EmployeeDaoImple implements EmployeeDeo {
	Scanner sc = new Scanner(System.in);
//Search employee
	@Override
	public EmployeeInfoBean searchEmployee(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
		EntityManager manager = factory.createEntityManager();
		EmployeeInfoBean employeeInfoBean = null;
		try {
			employeeInfoBean = manager.find(EmployeeInfoBean.class, id);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return employeeInfoBean;
	}// end of searchEmployee()
		// addEmployee

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManagerFactory factory = null;
		EntityManager manager1 = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("Employee");
			manager1 = factory.createEntityManager();
			transaction = manager1.getTransaction();

			transaction.begin();
			manager1.persist(employeeInfoBean);
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return true;

	}
//delete Employee
		@Override
		public boolean deleteEmployee(int id) {
			EntityManagerFactory factory = null;
			EntityManager manager1 = null;
			EntityTransaction transaction = null;
			try {
				factory = Persistence.createEntityManagerFactory("Employee");
				manager1 = factory.createEntityManager();
				transaction = manager1.getTransaction();
			EmployeeInfoBean eib	=manager1.find(EmployeeInfoBean.class, id);
				transaction.begin();
				manager1.remove(eib);
				transaction.commit();

			} catch (Exception e) {
				transaction.rollback();
				e.printStackTrace();
			}
			return true;

			
			
		}
//update employee
		@Override
		public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
			EntityManagerFactory factory = null;
			EntityManager manager1 = null;
			EntityTransaction transaction = null;
			EmployeeInfoBean embean=new EmployeeInfoBean();
			try {
				factory = Persistence.createEntityManagerFactory("Employee");
				manager1 = factory.createEntityManager();
				transaction = manager1.getTransaction();
				employeeInfoBean=manager1.find(EmployeeInfoBean.class,embean.getEmp_id());
				transaction.begin();
				
				employeeInfoBean.setAge(sc.nextInt());
				employeeInfoBean.setDesignation(sc.nextLine());
				employeeInfoBean.setEmp_name(sc.nextLine());
				employeeInfoBean.setSalary(sc.nextDouble());
				employeeInfoBean.setEmp_id(sc.nextInt());
				manager1.persist(employeeInfoBean);
				transaction.commit();

			} catch (Exception e) {
				transaction.rollback();
				e.printStackTrace();
			}
			return true;
		}
//Login
		@Override
		public EmployeeInfoBean login(int empid, String pass) {
			EntityManagerFactory factory =Persistence.createEntityManagerFactory("Employee");
			EntityManager manager1=factory.createEntityManager();
			EmployeeInfoBean embean=null;
			String jquery="from EmployeeInfoBean where emp_id=:empid and password=:pass";
			Query query=manager1.createQuery(jquery);
			query.setParameter("empid", empid);
			query.setParameter("pass",pass);
			try {
				embean=(EmployeeInfoBean) query.getSingleResult();
				
			} catch (Exception e) {
					e.printStackTrace();
			}
			return embean;
		}
//register
		@Override
		public void registerEmployee(EmployeeInfoBean employeeInfoBean) {
			
			EntityManagerFactory factory = null;
			EntityManager manager1 = null;
			EntityTransaction transaction = null;
			try {
				factory = Persistence.createEntityManagerFactory("Employee");
				manager1 = factory.createEntityManager();
				transaction = manager1.getTransaction();

				transaction.begin();
				manager1.persist(employeeInfoBean);
				transaction.commit();

			} catch (Exception e) {
				transaction.rollback();
				e.printStackTrace();
			}

		}
	

}// end of class
