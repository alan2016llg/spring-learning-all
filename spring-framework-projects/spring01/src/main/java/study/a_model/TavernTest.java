package study.a_model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @Author: liulg
 * @Date: 2020/10/14 14:38
 * 通过@Import注解导入类
 */
public class TavernTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("study.a_model");
        Boss boss = context.getBean(Boss.class);
        System.out.println(boss);
        Map<String, Bartender> bartenders = context.getBeansOfType(Bartender.class);
        bartenders.forEach((name, bartender) -> System.out.println(bartender));
        Map<String, Bar> bar = context.getBeansOfType(Bar.class);
        bar.forEach((name, bartender) -> System.out.println(name));
        System.out.println("\r");
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
