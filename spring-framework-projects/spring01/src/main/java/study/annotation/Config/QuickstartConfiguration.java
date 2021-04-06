package study.annotation.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import study.annotation.bean.Person;

/**
 * @Author: liulg
 * @Date: 2020/9/26 23:43
 * <p>
 * 基于注解的方式来配置bean
 */

@Configuration
@ComponentScan("study.annotation.bean")
public class QuickstartConfiguration {


    //向 IOC 容器注册一个类型为 Person ，id 为 person 的 Bean 。方法的返回值代表注册的类型，方法名代表 Bean 的 id
    @Bean
    public Person person() {
        return new Person();
    }


}
