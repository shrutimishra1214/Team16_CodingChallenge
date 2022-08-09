package com.db.grad.javaapi.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.db.grad.javaapi.model.Trade;

@Repository
public interface TradeRepository extends CrudRepository<Trade, Long> {
	
}