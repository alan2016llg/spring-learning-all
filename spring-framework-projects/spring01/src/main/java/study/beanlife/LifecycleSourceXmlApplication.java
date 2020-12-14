package study.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: liulg
 * @Date: 2020/12/14 22:20
 *
 * 基于xml文件演示bean周期中各种执行顺序
 * 手动又调用了refresh,会进行一些销毁的回调逻辑，实际可以看做是ioc容器的销毁后，再重新初始化ioc容器
 *
 */
public class LifecycleSourceXmlApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanlife/bean_life.xml");
        System.out.println("================准备刷新IOC容器==================");
        ((ClassPathXmlApplicationContext) context).refresh();
        System.out.println("================IOC容器刷新完毕==================");
        ((ClassPathXmlApplicationContext) context).start();
        System.out.println("================IOC容器启动完成==================");
        Person person = context.getBean(Person.class);
        System.out.println(person);
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat);
        System.out.println("================准备停止IOC容器==================");

        ((ClassPathXmlApplicationContext) context).stop();

        System.out.println("================IOC容器停止成功==================");

        ((ClassPathXmlApplicationContext) context).close();

    }
}
