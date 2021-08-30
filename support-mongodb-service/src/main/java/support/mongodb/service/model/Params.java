package support.mongodb.service.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "properties")
public class Params {

    private List<String> list;
    private String type;
    private ErrorCatalog error;
    private List<ErrorCatalog> listError;

    @Value("${properties.invalid-request}")
    private String[] invalidRequests;

    private Map<String, String> templates;
}
