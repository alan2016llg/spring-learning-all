package study.factoryprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.util.stream.Stream;

/**
 * @Author: liulg
 * @Date: 2020/12/7 14:59
 * <p>
 * 执行时机：BeanDefinition 解析完毕，注册进 BeanFactory 的阶段（ bean 未实例化）
 */
@Component
public class ColorNameSetterFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(beanName -> {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            if (StringUtils.hasText(beanDefinition.getBeanClassName())) {
                if (ClassUtils.resolveClassName(beanDefinition.getBeanClassName(), this.getClass().getClassLoader())
                        .getSuperclass().equals(Color.class)) {
                    beanDefinition.getPropertyValues().add("name", beanName + "7777");
                    beanDefinition.getPropertyValues().add("size", beanName + "big!!");

                }
            }
        });
    }
}
