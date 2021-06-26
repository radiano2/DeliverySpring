package group.demo;

import group.demo.CompleteOrder.CompleteOrderModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class DeliveryServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(DeliveryServiceApplication.class, args);
    }




}
