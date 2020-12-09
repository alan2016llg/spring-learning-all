package study.enablejdbc;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @Author: liulg
 * @Date: 2020/12/8 14:48
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnClassNameConditional.class)
public @interface ConditionalOnClassName {
   String value() default "";
}
