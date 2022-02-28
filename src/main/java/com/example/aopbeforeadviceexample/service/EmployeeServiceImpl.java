package com.example.aopbeforeadviceexample.service;

import org.springframework.stereotype.Service;

import com.example.aopbeforeadviceexample.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	public Employee createEmployee( String empId, String fname, String sname)
	{  
		Employee emp = new Employee();  
		emp.setEmpId(empId);  
		emp.setFirstName(fname);  
		emp.setSecondName(sname);  
		return emp;  
	}  
	public void deleteEmployee(String empId)   
	{  
	}  
}
