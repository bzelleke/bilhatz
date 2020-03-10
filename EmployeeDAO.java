package com.bilhat.Infosysbilhat.dao;

import java.util.List;

import com.bilhat.Infosysbilhat.entity.Employee;



public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
