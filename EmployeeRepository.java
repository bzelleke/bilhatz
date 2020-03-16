package com.bilhat.infosys.crudapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bilhat.infosys.crudapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!

}


