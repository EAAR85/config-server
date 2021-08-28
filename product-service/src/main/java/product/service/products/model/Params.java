package product.service.products.model;



import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Getter
@Setter
//@Configuration
//@ConfigurationProperties(prefix = "properties")
public class Params {

    private List<String> list;

    private String type;

}
