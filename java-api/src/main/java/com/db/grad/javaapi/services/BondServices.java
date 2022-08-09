package com.db.grad.javaapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.db.grad.javaapi.model.Bond;
import com.db.grad.javaapi.repository.BondRepository;


@Service
public class BondServices {
	@Autowired
	private BondRepository repo;
	
	public List<Bond> listAll(){
		return (List<Bond>) repo.findAll();
	}
	
	public void save(Bond bond) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		bond.setUsername(auth.getName());
		repo.save(bond);
	}
	
	public Bond get(Long id) {
		return repo.findById(id).get();
	}

}
