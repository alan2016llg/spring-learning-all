package aop.test4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2021/3/22 22:34
 */
public class AnnotationAspectJApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AspectJAOPConfiguration.class);
        Partner s = ctx.getBean(Partner.class);
        s.receiveMoney(23);
    }
}
