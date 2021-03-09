package configserver.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    //EJEMPLO BASE:
    //https://www.youtube.com/watch?v=ydtswONk9TE&list=PLxy6jHplP3Hi_W8iuYSbAeeMfaTZt49PW&index=13
    //https://www.youtube.com/watch?v=ydtswONk9TE&list=PLxy6jHplP3Hi_W8iuYSbAeeMfaTZt49PW&index=13

    //http://@localhost:8081
    //http://root:s3cr3t@localhost:8081
    //http://root:s3cr3t@localhost:8081/producto-service/default
}
