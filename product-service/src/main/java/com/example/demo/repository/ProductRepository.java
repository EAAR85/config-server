package com.example.demo.repository;

import com.example.demo.model.db.Book;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Book, String> {

    //funciona
    @Query("{'nombre': '?0' }")
    Flux<Book> findName(String nombre);

    //funciona
    @Query("{'nombre': ?0 }")
    Flux<Book> findName2(String nombre);

    //funciona
    @Query("{'nombre': {'$in': ?0} }")
    Flux<Book> findNameIn(List<String> nombres);

    //FALTA PROBAR ESTE CASO: https://stackoverflow.com/questions/58807234/mongoreactiverepository-find-by-list-of-values-in-operator
    //@Query("{'properties.$id': {'$in': ?0}}")
    //Flux<Offer> findByPropertiesIds(List<ObjectId> propertiesId);

}
