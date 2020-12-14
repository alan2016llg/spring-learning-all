package study.beanlife;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liulg
 * @Date: 2020/12/14 22:17
 */
//@Configuration
@ComponentScan(basePackages = "study.beanlife")
public class LifecycleSourceConfiguration {

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    public Person person(){
        Person person = new Person();
        person.setName("lisi");
        return person;
    }
}
