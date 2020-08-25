package com.cts.microservices.productcatalogservice.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.microservices.productcatalogservice.entity.Review;


public interface ReviewRepository extends JpaRepository<Review, Long> {
	
	
	List<Review> findByProductId(int id); 

	
	Review save(Review review);
	

}
