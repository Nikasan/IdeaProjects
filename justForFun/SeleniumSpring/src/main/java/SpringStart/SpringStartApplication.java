package SpringStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan("SpringStart.pages")
@Configuration
public class SpringStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringStartApplication.class, args);
//        ApplicationContext context = SpringApplication.run(SpringStartApplication.class, args);
//        Car car = context.getBean(Car.class);
//        car.getCar();
    }
}
