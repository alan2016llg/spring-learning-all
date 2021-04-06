package aop.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @Author: liulg
 * @Date: 2021/3/22 22:34
 */
public class AnnotationAspectJApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AspectJAOPConfiguration.class);
        /*String[] names = ctx.getBeanDefinitionNames();
        Stream.of(names).forEach(x->System.out.println(x));*/
        Partner s = ctx.getBean(Partner.class);
        s.receiveMoney(23);
    }
}
