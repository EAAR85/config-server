package com.example.demo.rest;

import com.example.demo.model.ErrorCatalog;
import com.example.demo.model.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    Params params;

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
}
