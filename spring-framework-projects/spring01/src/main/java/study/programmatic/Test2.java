package study.programmatic;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2020/12/7 21:29
 */
public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //注册person类
        BeanDefinition personDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class)
                .addPropertyValue("name", "老王").getBeanDefinition();
        ctx.registerBeanDefinition("laowang", personDefinition);
        //注册cat类
        BeanDefinition catDefinition = BeanDefinitionBuilder.rootBeanDefinition(Cat.class)
                .addPropertyValue("name","mimi")
                .addPropertyReference("person","laowang").getBeanDefinition();
        ctx.registerBeanDefinition("cat",catDefinition);
        //注册dog,并设置为原型bean
        BeanDefinition dogDefinition = BeanDefinitionBuilder.rootBeanDefinition(Dog.class)
                .addPropertyValue("name", "汪汪").addPropertyReference("person", "laowang")
                .setScope(ConfigurableBeanFactory.SCOPE_PROTOTYPE).getBeanDefinition();
        ctx.registerBeanDefinition("wangwang", dogDefinition);
        //refresh方法的执行，会触发非延迟加载的单实例 bean 的实例化和初始化。
        ctx.refresh();
        System.out.println("ApplicationContext refreshed ......");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        System.out.println(ctx.getBean(Dog.class));

    }
}
