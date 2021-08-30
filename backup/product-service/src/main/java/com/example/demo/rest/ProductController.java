package com.example.demo.rest;

import com.example.demo.model.ErrorCatalog;
import com.example.demo.model.Params;
import com.example.demo.model.entity.Book;
import com.example.demo.model.entity.Product;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    Params params;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/welcome")
    public String mensaje() {

        //http://localhost:8888/swagger-ui/index.html
        return "oli";
    }

    @GetMapping("/getList")
    public List<String> list() {
        return params.getList();
    }

    @GetMapping("/getError")
    public ErrorCatalog getError() {
        return params.getError();
    }

    @GetMapping("/getErrors")
    public List<ErrorCatalog> getErrors() {
        return params.getListError();
    }

    @GetMapping("/getInvalids")
    public String[] getInvalids() {
        return params.getInvalidRequests();
    }

    @GetMapping("/getTemplates")
    public Map<String, String> getTemplates() {
        return params.getTemplates();
    }

    @GetMapping("/getBookList")
    public Flux<Book> getBookList() {
        Flux<Book> bookList = bookRepository.findAll().doOnNext(x -> System.out.println(x.getNombre()));

        return bookList;
    }

    @GetMapping("/getProductList")
    public Flux<Product> getProductList() {
        Flux<Product> productList = productRepository.findAll().doOnNext(x -> System.out.println(x.getCodigo()));

        return productList;
    }

    @GetMapping("/getProductListPaginate")
    public Flux<Product> getProductListPaginate() {
        int page = 0;
        int rows = 5;
        
        Pageable pageable = PageRequest.of(page, rows);
        Flux<Product> productList = productRepository.allProductPaged(pageable);

        return productList;
    }

}
