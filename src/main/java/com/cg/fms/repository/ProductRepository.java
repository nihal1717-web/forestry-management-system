package com.cg.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cg.fms.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	//public Product fetchById(int id);
}

