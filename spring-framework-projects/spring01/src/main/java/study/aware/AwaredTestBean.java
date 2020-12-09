package study.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

/**
 * @Author: liulg
 * @Date: 2020/10/9 9:36
 *
 * ApplicationContextAware:回调注入 ApplicationContext
 * BeanNameAware:获取注入的bean的名字
 */
public class AwaredTestBean implements ApplicationContextAware,BeanNameAware {

    private  ApplicationContext ctx;
    private  String beanName;

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.ctx=applicationContext;
    }

    //测试打印所有的bean名称
    public void printBeanNames() {
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Override
    public void setBeanName(String s) {
        this.beanName=s;
    }
}
