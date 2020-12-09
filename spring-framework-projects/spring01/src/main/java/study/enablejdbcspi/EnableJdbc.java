package study.enablejdbcspi;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: liulg
 * @Date: 2020/12/8 14:44
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(JdbcConfigSelector.class)
public @interface EnableJdbc {
}
