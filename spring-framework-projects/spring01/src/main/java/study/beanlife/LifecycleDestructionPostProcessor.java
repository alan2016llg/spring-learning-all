package study.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

/**
 * @Author: liulg
 * @Date: 2020/12/14 21:55
 */
public class LifecycleDestructionPostProcessor implements DestructionAwareBeanPostProcessor{
    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if (bean instanceof Cat) {
            Cat cat = (Cat) bean;
            System.out.println(cat.getName() + "被放走了 ......");
        }
    }
}
