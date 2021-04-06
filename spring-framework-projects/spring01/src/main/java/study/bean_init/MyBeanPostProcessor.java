package study.bean_init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/11/16 16:39
 * <p>
 * BeanPostProcessor接口实现类可以在bean初始化前后对bean做一些处理。
 * BeanPostProcessor是针对于容器中的所有的bean的
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {


    /**
     * 任何bean对象在初始化方法回调之后都会调用BeanPostProcessor的
     * postProcessAfterInitialization方法。我们可以在该方法体里面对返回的bean再做一层封装。
     * 调用该方法前，我们传递进来的bean对象是已经填充好了属性值的。当我们把BeanPostProcessor作为
     * 一个bean定义在ApplicationContext中时，ApplicationContext会自动检测到它并把它当做
     * 一个BeanPostProcessor进行调用。
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化完成：" + beanName);
        return bean;
    }

    /**
     * 任何bean对象在初始化方法回调之前都会调用BeanPostProcessor的
     * postProcessBeforeInitialization方法。调用该方法前，我们传递进来的
     * bean对象是已经填充好了属性值的。
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化前：" + beanName);
        if (bean instanceof Cap) {
            System.out.println(((Cap) bean).name);
        }
        return bean;
    }
}
