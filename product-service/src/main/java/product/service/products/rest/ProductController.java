package product.service.products.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);



    @GetMapping("/welcome")
    public String mensaje() {
        return "oli";
        //http://localhost:8888/swagger-ui/index.html
    }

    @GetMapping("/list")
    public List<String> list() {
        //Params params = new Params();
        //return params.getList();
        return Arrays.asList("abcd");
    }

    @GetMapping("/type")
    public String type() {
        //Params params = new Params();
        //return params.getType();
        return "abc";
    }
}
