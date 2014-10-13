package fnjsw.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Bean
    public static AppConfig propertySourcesPlaceholderConfigurer() {
        return new AppConfig();
    }
}
