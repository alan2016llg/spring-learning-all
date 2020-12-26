package study.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: liulg
 * @Date: 2020/12/14 22:20
 *
 * 基于xml文件演示bean周期中各种执行顺序
 * 顺序：   构造器-->@PostConstruct-->afterPropertiesSet(InitializingBean接口)-->init-method-->postProcessAfterInitialization(BeanPostProcessor接口)
 *     -->手动调用start(Lifecycle)-->销毁容器-->手动调用stop(Lifecycle)-->postProcessBeforeDestruction(DestructionAwareBeanPostProcessor)
 *     -->@PreDestroy-->destroy(DisposableBean)-->destroy-method
 *
 * 重复调用refresh时，会回调postProcessBeforeDestruction(DestructionAwareBeanPostProcessor)，@PreDestroy，DisposableBean，destroy-method这些方法；
 * 然后再执行构造器，@PostConstruct，InitializingBean，init-Method，postProcessAfterInitialization(BeanPostProcessor)这些方法。
 * 所以：刷新动作等同于销毁容器后再新建容器
 *
 */
public class LifecycleSourceXmlApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanlife/bean_life.xml");
        System.out.println("================准备刷新IOC容器==================");
        ((ClassPathXmlApplicationContext) context).refresh();
//        System.out.println("================准备第三次刷新IOC容器==================");
//        ((ClassPathXmlApplicationContext) context).refresh();
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
