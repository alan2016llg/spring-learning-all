package study.a_conditional.normal;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: liulg
 * @Date: 2020/10/14 15:56
 */
public class OnBeanCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 先获取目标自定义注解ConditionalOnBean上的beanNames属性
        String[] beanNames = (String[]) metadata.getAnnotationAttributes(ConditionalOnBean.class.getName()).get("beanNames");
       Class<?>[] classes  = (Class<?>[]) metadata.getAnnotationAttributes(ConditionalOnBean.class.getName()).get("value");
        for (Class cla : classes) {
            if (!context.getBeanFactory().containsBeanDefinition(cla.getName())) {
                return false;
            }
        }
        // 逐个校验IOC容器中是否包含传入的bean名称
        for (String beanName : beanNames) {
            if (!context.getBeanFactory().containsBeanDefinition(beanName)) {
                return false;
            }
        }
        return true;
    }
}
