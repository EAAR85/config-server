package support.mongodb.service.repository;


import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import support.mongodb.service.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends ReactiveMongoRepository<Book, String> {

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
