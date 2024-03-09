package beanPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    // we need methods that are returning our full-time and part-time objects

    @Bean
      FullTimeEmployee fullTimeEmployee(){
         return new FullTimeEmployee ();
     }
      @Bean
       PartTimeEmployee partTimeEmployee(){
         return new PartTimeEmployee();
      }

}
