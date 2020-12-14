package study.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: liulg
 * @Date: 2020/12/14 21:54
 * 体现出后置处理器的回调
 */
public class LifecycleNameReadPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Person) {
            Person person = (Person) bean;
            System.out.println("LifecycleNameReadPostProcessor ------> " + person.getName());
        }
        return bean;
    }
}
