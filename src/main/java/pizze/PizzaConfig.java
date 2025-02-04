package pizze;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {
    @Bean
    public Pizza pizza() {
        return new Pizza();
    }
}
