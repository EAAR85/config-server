package com.example.demo.repository;

import com.example.demo.model.db.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String>{
//, JpaSpecificationExecutor<Product> 
}
