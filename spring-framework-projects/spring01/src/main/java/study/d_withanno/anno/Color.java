package study.d_withanno.anno;

import java.lang.annotation.*;

/**
 * @Author: liulg
 * @Date: 2020/9/25 15:33
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Color {
}
