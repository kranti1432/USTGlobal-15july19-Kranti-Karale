package com.dev.servelet.dao;

import com.ust.dto.EmployeeInfoBean;

public interface EmployeeDeo {
public EmployeeInfoBean searchEmployee(int id);
public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
public boolean deleteEmployee(int id);
public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
public EmployeeInfoBean login( int empid,String pass);
public void registerEmployee(EmployeeInfoBean employeeInfoBean);
}
