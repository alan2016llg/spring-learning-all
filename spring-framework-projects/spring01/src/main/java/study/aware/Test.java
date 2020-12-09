package study.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2020/10/9 9:41
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        AwaredTestBean awaredTestBean = (AwaredTestBean) context.getBean("aaa");
        awaredTestBean.printBeanNames();
        System.out.println("-----------");
        System.out.println(awaredTestBean.getBeanName());
    }
}
