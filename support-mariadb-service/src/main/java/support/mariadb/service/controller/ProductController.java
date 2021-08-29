package support.mariadb.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import support.mariadb.service.model.ProductRequest;
import support.mariadb.service.model.entity.Product;
import support.mariadb.service.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/api/support-mariadb-service/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/setProduct")
    public Product setProduct(@RequestBody ProductRequest request) {

        Product product = new Product();
        product.setDescription(request.getDescription());
        product.setStatus(request.getStatus());
        Product result = productRepository.save(product);

        return result;
    }
}

// https://www.javaguides.net/2020/01/spring-boot-mariadb-crud-example-tutorial.html


