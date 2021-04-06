package aop.test4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: liulg
 * @Date: 2021/3/22 18:01
 */
@Configuration
@ComponentScan(value = "aop.test5")
@EnableAspectJAutoProxy
public class AspectJAOPConfiguration {
}
