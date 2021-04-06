package aop.test5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: liulg
 * @Date: 2021/3/22 18:01
 */
@Configuration
@ComponentScan(value = "aop.test5")
@EnableAspectJAutoProxy(exposeProxy = true) //暴露代理对象
public class AspectJAOPConfiguration {
}
