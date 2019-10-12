package com.dev.Assesment.essPortal;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.EssPortal.dto.Employee_Info;
import com.EssPortal.dto.Employee_Leave_info;
import com.sun.xml.internal.ws.api.pipe.NextAction;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction transaction = null;

		entitymanagerfactory = Persistence.createEntityManagerFactory("Final");
		entitymanager = entitymanagerfactory.createEntityManager();
		transaction = entitymanager.getTransaction();
		Employee_Info emInfo = new Employee_Info();
		Employee_Leave_info emLeave = new Employee_Leave_info();
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 : to insert employee Info");
		System.out.println("press 2 : to inter id and password for login");
		int i = sc.nextInt();

		if (i == 1) {
			try {
				System.out.println("enter employee id");
				int id = sc.nextInt();
				emInfo.setEmployee_id(id);
				System.out.println("enter employee email");
				String email = sc.nextLine();
				sc.nextLine();
				emInfo.setEmployee_email(email);
				System.out.println("enter employee name");
				String name = sc.nextLine();

				emInfo.setEmployee_name(name);
				System.out.println("enter employee password");
				String password = sc.nextLine();
				emInfo.setEmployee_password(password);
				System.out.println("enter employee type");
				String type = sc.nextLine();
				emInfo.setEmployee_type(type);
				// emLeave.setEmployee_id1(emInfo);
				transaction.begin();
				entitymanager.persist(emInfo);
				transaction.commit();
				System.out.println("Employee information added successfully");
			} catch (Exception e) {
				transaction.rollback();
				e.printStackTrace();
			} finally {
				entitymanager.close();
			}
		}
		if (i == 2) {
			System.out.println("enter details for login");
			System.out.println("enter employee id");
			int id1 = sc.nextInt();
			emInfo.setEmployee_id(id1);
			System.out.println("enter employee password");
			String password = sc.nextLine();
			emInfo.setEmployee_password(password);
			sc.nextLine();
			Employee_Info emInfo1 = new Employee_Info();
			emInfo1 = entitymanager.find(Employee_Info.class, id1);
			String type1 = emInfo1.getEmployee_type();
			// System.out.println(type1);
			if (type1 == type1) {
				System.out.println("press 1:to show all request");
				System.out.println("press 2:to approve/reject leave request");
				int option = sc.nextInt();

				if (option == 1) {
					String jpql = "from Employee_Leave_info";
					javax.persistence.Query query = entitymanager.createQuery(jpql);
					List<Employee_Leave_info> resultList = query.getResultList();
					for (Employee_Leave_info em1 : resultList) {
						System.out.println(em1.getEmployee_id());
						System.out.println(em1.getLeave_date());
						System.out.println(em1.getLeave_status());
					}

				}
				if (option == 2) {
					int c = sc.nextInt();
					Employee_Leave_info em3 = new Employee_Leave_info();
					System.out.println("enter employee id to reject /aprrove leave");

					em3 = entitymanager.find(Employee_Leave_info.class, c);
					System.out.println("enter status");
					String status = sc.nextLine();
					transaction.begin();
					em3.setLeave_status(status);
					transaction.commit();

				}
				if (type1 != type1) {
					System.out.println("press 1:to show all leave status");
					System.out.println("press 2:to request leave");
					int option1 = sc.nextInt();

					if (option1 == 1) {
						String jpql = "from Employee_Leave_info";
						javax.persistence.Query query = entitymanager.createQuery(jpql);
						List<Employee_Leave_info> resultList = query.getResultList();
						for (Employee_Leave_info em1 : resultList) {
							System.out.println(em1.getLeave_status());
						}

					}
					if (option == 2) {
						try {
							System.out.println("enter employee id");
							int id = sc.nextInt();
							emInfo.setEmployee_id(id);
							System.out.println("enter employee email");
							String email = sc.nextLine();
							sc.nextLine();
							emInfo.setEmployee_email(email);
							System.out.println("enter employee name");
							String name = sc.nextLine();

							emInfo.setEmployee_name(name);
							System.out.println("enter employee password");
							String password1 = sc.nextLine();
							emInfo.setEmployee_password(password1);
							System.out.println("enter employee type");
							String type = sc.nextLine();
							emInfo.setEmployee_type(type);
							// emLeave.setEmployee_id1(emInfo);
							transaction.begin();
							entitymanager.persist(emInfo);
							transaction.commit();
							System.out.println("Employee information added successfully");
						} catch (Exception e) {
							transaction.rollback();
							e.printStackTrace();
						} finally {
							entitymanager.close();
						}
					}

				}

			}

		}
	}
}
