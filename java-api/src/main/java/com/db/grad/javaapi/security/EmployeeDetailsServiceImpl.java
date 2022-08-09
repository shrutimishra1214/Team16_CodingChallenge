package com.db.grad.javaapi.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.db.grad.javaapi.model.Employee;
import com.db.grad.javaapi.repository.EmployeeRepository;


public class EmployeeDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee employee =employeeRepository.getEmployeeByUsername(username);
		if(employee==null) {
			throw new UsernameNotFoundException("Could not find User");
		}
		return new MyEmployeeDetails(employee);
	}

}
