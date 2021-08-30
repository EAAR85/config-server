package support.mongodb.service.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import support.mongodb.service.model.Product;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

    @Query("{ id: { $exists: true }}")
    Flux<Product> allProductPaged(final Pageable page);
}