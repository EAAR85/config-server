package support.mariadb.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import support.mariadb.service.model.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
