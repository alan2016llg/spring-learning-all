package study.a_initmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: liulg
 * @Date: 2020/10/9 11:47
 */
public class Test {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("init_method/init.xml");
        ((ClassPathXmlApplicationContext) context).close();
        System.out.println("完毕");

        //原型bean的测试
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        Pen3 pen3 = (Pen3) ctx.getBean("pen3");
        ((AnnotationConfigApplicationContext) ctx).getBeanFactory().destroyBean(pen3);
       /* //单例bean
        Pen4 pen4 = (Pen4) ctx.getBean("pen4");
        ((AnnotationConfigApplicationContext) ctx).getBeanFactory().destroyBean(pen4);*/
        //容器关闭
        System.out.println("开始容器关闭");
        ((AnnotationConfigApplicationContext)ctx).close();
        System.out.println("完毕");

    }
}
