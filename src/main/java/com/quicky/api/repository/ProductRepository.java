package com.quicky.api.repository;

import java.util.List;

import com.quicky.api.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByPublished(boolean published);
	List<Product> findByTitleContaining(String title);
}
