package study.d_withanno;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;
import study.d_withanno.anno.Color;
import study.d_withanno.bean.Dog;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @Author: liulg
 * @Date: 2020/9/25 15:40
 * 获取所有带有某个注解的bean---getBeansWithAnnotation
 */
public class WithAnnoApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("/anno/spring_anno.xml");
        System.out.println(context.getBean("dog"));
        //获取带有clor注解的bean
        Map<String, Object> beansWithAnnotation = context.getBeansWithAnnotation(Color.class);
        beansWithAnnotation.forEach((k, v) -> {
            System.out.println(k + ":" + v.toString());
        });

        //获取ioc容器中所有的bean
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);

        //延迟查找，spring5的拓展使用
        ObjectProvider<Dog> objectProvider = context.getBeanProvider(Dog.class);
        Dog d = objectProvider.getIfAvailable(Dog::new);//不存在则创建
        objectProvider.ifAvailable(dog -> {
            System.out.println(dog);
        });//存在则执行
    }
}
