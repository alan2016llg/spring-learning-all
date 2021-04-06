package aop.test5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2021/3/22 22:34
 * <p>
 * 实现切面类对一个类的所有方法增强时，一个方法中又调用另一个方法的场景，切面类增强逻辑执行两次。
 */
public class AnnotationAspectJApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AspectJAOPConfiguration.class);
        Partner s = ctx.getBean(Partner.class);
        s.receiveMoney(23);
    }
}
