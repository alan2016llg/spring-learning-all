package aop.test3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: liulg
 * @Date: 2021/3/22 18:01
 */
@Configuration
@ComponentScan(value = "aop.test3")
@EnableAspectJAutoProxy
public class AspectJAOPConfiguration {
}
