package study.programmatic;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2020/12/7 17:22
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context  = new AnnotationConfigApplicationContext();
        //手动获取一个bean定义对象
        BeanDefinition definition = BeanDefinitionBuilder.rootBeanDefinition(Person.class).getBeanDefinition();
        //属性赋值
        definition.getPropertyValues().add("name","alan");
        //注册
        ((AnnotationConfigApplicationContext) context).registerBeanDefinition("person",definition);
        //手动刷新
        ((AnnotationConfigApplicationContext) context).refresh();
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
    }
}
