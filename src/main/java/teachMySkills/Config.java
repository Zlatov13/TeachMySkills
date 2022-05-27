package teachMySkills;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "teachMySkills")
public class Config {
   @Bean (name = "helloTeacher")
    public HelloTeacher helloTeacher(){
        return new HelloTeacher();
    }
}
