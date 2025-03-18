package com.nikhilgupta.product_service.repository;

import com.nikhilgupta.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
