package study.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import study.annotation.Config.QuickstartConfiguration;
import study.annotation.bean.Cat;
import study.annotation.bean.Person;

import java.util.Map;

/**
 * @Author: liulg
 * @Date: 2020/9/26 23:47
 */
public class AnnotationConfigApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        Person person = (Person) context.getBean("person");
        Map<String, Object> beansWithAnnotation = context.getBeansWithAnnotation(Component.class);
        System.out.println(person);
        beansWithAnnotation.forEach((k, v) -> {
            if (k.equals("myCat")) {
                System.out.println(k);
            }
        });

    }
}
