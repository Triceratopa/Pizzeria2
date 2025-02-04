package topping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingsConfig {
    @Bean
    public Toppings toppings() {
        return new Toppings();
    }
}
