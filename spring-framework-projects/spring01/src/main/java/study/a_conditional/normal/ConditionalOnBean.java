package study.a_conditional.normal;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @Author: liulg
 * @Date: 2020/10/14 15:58
 *
 * 抽取出来，成为通用的
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnBeanCondition.class)
public @interface ConditionalOnBean {
    String[] beanNames() default {};
    Class<?>[] value() default {};

}
