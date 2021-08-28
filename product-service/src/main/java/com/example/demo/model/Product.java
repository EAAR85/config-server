package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Setter
@Getter
@Document(collection = "libro")
public class Product {

    @Id
    private String id;

    @Field("nombre")
    private String nombre;

    public Product() {
    }

    public Product(String nombre) {
        this.nombre = nombre;
    }
}
