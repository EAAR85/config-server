package support.mongodb.service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorCatalog {

    private String code;
    private String message;
}