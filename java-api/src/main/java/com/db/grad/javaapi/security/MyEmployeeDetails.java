package com.db.grad.javaapi.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.db.grad.javaapi.model.Employee;
import com.db.grad.javaapi.model.Role;



public class MyEmployeeDetails implements UserDetails{
	
	private Employee employee;
	public MyEmployeeDetails(Employee employee) {
		this.employee=employee;
		
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<Role> roles=employee.getRoles();
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		
		for(Role role:roles) {
			authorities.add(new SimpleGrantedAuthority(role.getName()));
		}
		
		return authorities;
	}
	
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return employee.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return employee.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return employee.isEnabled();
	}

}
