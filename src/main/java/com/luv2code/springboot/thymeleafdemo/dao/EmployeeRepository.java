package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// that's it, no need to write an implementation class
	
	// add a method to sort by last name
	
	public List<Employee> findAllByOrderByLastNameAsc();

	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String theName, String theName2);
}
