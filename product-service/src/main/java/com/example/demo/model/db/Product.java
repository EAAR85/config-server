package com.example.demo.model.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Producto")
public class Product {

    @Id
    private String id;

    @Field("Codigo")
    private String codigo;

    @Field("Titulo")
    private String titulo;

    @Field("SubTitulo")
    private String subtitulo;

    @Field("Descripcion")
    private String descripcion;

    @Field("Precio1")
    private Double precio1;

    @Field("Precio2")
    private Double precio2;

    @Field("Categoria")
    private String categoria;

    @Field("CategoriaId")
    private String categoriaId;

    @Field("SubCategoria")
    private String SubCategoria;

    @Field("SubCategoriaId")
    private String SubCategoriaId;

    @Field("Imagen")
    private String imagen;

    @Field("Imagenes")
    private List<String> imagenes;
}
