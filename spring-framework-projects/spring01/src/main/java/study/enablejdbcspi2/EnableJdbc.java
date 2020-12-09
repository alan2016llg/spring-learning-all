package study.enablejdbcspi2;

import org.springframework.context.annotation.Import;
import study.enablejdbcspi.JdbcConfigSelector;

import java.lang.annotation.*;

/**
 * @Author: liulg
 * @Date: 2020/12/8 14:44
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(JdbcConfiguration.class)
public @interface EnableJdbc {
}
