package product.service.products.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {

    private String id;

    private String nombre;

    public Product() {
    }

    public Product(String nombre) {
        this.nombre = nombre;
    }
}
