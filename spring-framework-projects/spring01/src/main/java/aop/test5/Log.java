package aop.test5;

import java.lang.annotation.*;

/**
 * @Author: liulg
 * @Date: 2021/3/22 23:39
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Log {
}
