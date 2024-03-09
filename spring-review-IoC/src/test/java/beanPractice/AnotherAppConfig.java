package beanPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherAppConfig {
    @Bean
    public String str1() {
        return "welcome to cydeo";
    }

    @Bean
    public String str2() {
        return "Spring core practice";
    }
}
