package com.example.demo.repository;

import com.example.demo.model.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String>{

    @Query("{ id: { $exists: true }}")
    Flux<Product> allProductPaged(final Pageable page);
}
