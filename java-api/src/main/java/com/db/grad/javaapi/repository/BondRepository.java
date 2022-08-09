package com.db.grad.javaapi.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.db.grad.javaapi.model.Bond;

@Repository
public interface BondRepository extends CrudRepository<Bond, Long> {
	@Query("SELECT b from Bond b Where b.username = :username")
	public Bond getBondByEmployeeId(@Param("username") String username);

}
