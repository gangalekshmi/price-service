package com.cts.microservices.productcatalogservice;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.microservices.productcatalogservice.DAO.ProductRepository;
import com.cts.microservices.productcatalogservice.DAO.ReviewRepository;
import com.cts.microservices.productcatalogservice.entity.Product;
import com.cts.microservices.productcatalogservice.entity.Review;

@SpringBootApplication
public class LoadSearchDataApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(LoadSearchDataApplication.class, args);
	
		ProductRepository repo = ac.getBean(ProductRepository.class);
		
		ReviewRepository reviewrepo = ac.getBean(ReviewRepository.class);

		List<Product> product = new ArrayList<>();
	
		List<Review> review = new ArrayList<>();

		Product p1=new Product(1, "Bag", 200, "Test type");
		
		product.add(new Product(1, "Bag", 200, "Test type"));
		product.add(new Product(2, "Shoes", 1800, "Test new product"));
		product.add(new Product(3, "Mat", 350, "Test new product mat"));
		
		repo.saveAll(product);
		
		
		review.add(new Review(1, 3, "nik", "Avg", p1 ));
		
		reviewrepo.saveAll(review);
		

	}

}
