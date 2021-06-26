package group.demo.CompleteOrder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CompleteOrderConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            CompleteOrderRepository completeOrderRepository) {
        return args -> {
            CompleteOrderModel order1 = new CompleteOrderModel(
                    "Joe",
                    "Smith",
                    14.99,
                    "Burger , Pizza , Etc...."
            );
            CompleteOrderModel order2 = new CompleteOrderModel(
                    "Anton",
                    "Radionov",
                    20.99,
                    "Burger , Pizza , Etc...."
            );

            completeOrderRepository.saveAll(
                    List.of(order1,order2)
            );
        };
    }
}
