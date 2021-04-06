package study.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.di.bean.*;
import study.di.proconf.InjectValueConfiguration;

/**
 * @Author: liulg
 * @Date: 2020/9/18 15:31
 * <p>
 * 依赖注入
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/spring_di.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);
        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);

        //构造器注入
        Dog dog = (Dog) beanFactory.getBean("dog");
        System.out.println(dog.getName());

        //注解注入
        ApplicationContext context = new AnnotationConfigApplicationContext("study.di.bean");
        Black black = (Black) context.getBean("black");
        System.out.println(black.getName());

        //配置类引入
        ApplicationContext context1 = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        Red red = (Red) context1.getBean("red");
        System.out.println(red);

        //SpEL属性注入,SpEL 可以取 IOC 容器中其它 Bean 的属性
        Blue blue = (Blue) context1.getBean("blue");
        System.out.println(blue);
        //SpEL 表达式不仅可以引用对象的属性，还可以直接引用类常量，以及调用对象的方法
        Green green = (Green) context1.getBean("green");
        System.out.println(green);

    }
}
