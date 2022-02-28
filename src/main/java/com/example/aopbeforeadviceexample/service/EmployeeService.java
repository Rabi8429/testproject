package com.example.aopbeforeadviceexample.service;

import com.example.aopbeforeadviceexample.model.Employee;

public interface EmployeeService {
	Employee createEmployee( String empId, String fname, String sname);
	void deleteEmployee(String empId);
}
