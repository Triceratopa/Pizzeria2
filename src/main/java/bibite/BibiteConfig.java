package bibite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BibiteConfig {
    @Bean
    public Bibite bibite() {
        return new Bibite();
    }
}
