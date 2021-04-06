package study.di.fixdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import study.di.fixdi.bean.Dog;

/**
 * @Author: liulg
 * @Date: 2020/9/28 14:35
 */

@Configuration
@ComponentScan("study.di.fixdi.bean")
public class Config {


    @Bean
    @Primary
    public Dog getDog() {
        return new Dog();
    }
}
