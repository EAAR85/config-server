package product.service.products.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import product.service.products.model.Product;
import product.service.products.repository.ProductRepository;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/mensaje")
    public String mensaje() {


        return "oli";

        //http://localhost:8888/swagger-ui/index.html

    }

    @GetMapping("/list")
    public Flux<Product> list() {
        Flux<Product> libros = productRepository.findAll().doOnNext(x -> System.out.println(x.getNombre()));
        //Flux<Libro> libros = dao.findAll();

        return libros;

        //http://localhost:8888/swagger-ui/index.html

        //http://localhost:8080/api/libro/lista
        //http://localhost:8888/api/libro/lista
    }
}
