package com.db.grad.javaapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.TradeRepository;


@Service
public class TradeServices {
	@Autowired
	private TradeRepository repo;
	
	public List<Trade> listAll(){
		return (List<Trade>) repo.findAll();
	}
	
	public void save(Trade trade) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		repo.save(trade);
	}
	
	public Trade get(Long id) {
		return repo.findById(id).get();
	}

}
