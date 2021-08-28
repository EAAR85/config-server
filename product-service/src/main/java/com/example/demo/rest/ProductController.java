package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @GetMapping("/welcome")
    public String mensaje() {


        return "oli";

        //http://localhost:8888/swagger-ui/index.html

    }

}
