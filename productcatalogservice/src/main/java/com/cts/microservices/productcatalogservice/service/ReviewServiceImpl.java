package com.cts.microservices.productcatalogservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.microservices.productcatalogservice.DAO.ReviewRepository;
import com.cts.microservices.productcatalogservice.entity.Review;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	private ReviewRepository dao;

	@Override
	public List<Review> findById(int id) {
		// TODO Auto-generated method stub
		return dao.findByProductId(id);
	}

	@Override
	public Review saveReview(Review review) {
		// TODO Auto-generated method stub
		return dao.save(review);
	}

	
}
