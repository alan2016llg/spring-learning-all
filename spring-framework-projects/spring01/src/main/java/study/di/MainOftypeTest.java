package study.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.di.oftype.dao.DemoDao;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author: liulg
 * @Date: 2020/9/18 16:21
 * ApplicationContext类的优点比BeanFactory多得多，是其子类，扩展了许多的特性，应该优先使用它
 */
public class MainOftypeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_di/spring_oftype.xml");
        String[] beanname = context.getBeanNamesForType(DemoDao.class);
        Arrays.stream(beanname).forEach(System.out::println);
        Map<String, DemoDao> beans = context.getBeansOfType(DemoDao.class);
        beans.forEach((name, bean) -> System.out.println("bean name:" + name + ",bean class:" + bean.toString()));
    }
}
