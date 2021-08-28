package product.service.products.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import product.service.products.model.Product;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface ProductRepository  extends ReactiveMongoRepository<Product, String> {

    //funciona
    @Query("{'nombre': '?0' }")
    Flux<Product> findName(String nombre);

    //funciona
    @Query("{'nombre': ?0 }")
    Flux<Product> findName2(String nombre);

    //funciona
    @Query("{'nombre': {'$in': ?0} }")
    Flux<Product> findNameIn(List<String> nombres);

    //FALTA PROBAR ESTE CASO: https://stackoverflow.com/questions/58807234/mongoreactiverepository-find-by-list-of-values-in-operator
    //@Query("{'properties.$id': {'$in': ?0}}")
    //Flux<Offer> findByPropertiesIds(List<ObjectId> propertiesId);

}
