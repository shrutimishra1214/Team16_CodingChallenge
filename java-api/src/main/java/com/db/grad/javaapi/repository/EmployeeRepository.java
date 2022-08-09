package com.db.grad.javaapi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.db.grad.javaapi.model.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	@Query("SELECT u from Employee u Where u.username = :username")
	public Employee getEmployeeByUsername(@Param("username") String username);

}
