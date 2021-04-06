package study.enablejdbcspi2;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

/**
 * 需求：根据存在的数据库驱动进行数据源的注入，从而实现不同数据源的切换。
 *
 * @Author: liulg
 * @Date: 2020/12/8 14:55
 * 基于spring SPI方式进行数据源加载,完全版
 */
@EnableJdbc
@PropertySource("classpath:enablejdbc/jdbc.properties")
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Test.class);
        String[] beanNamesForType = ctx.getBeanNamesForType(DruidDataSource.class);
        Arrays.stream(beanNamesForType).forEach(s -> {
            System.out.println("已加载数据源：" + s);
        });
        DruidDataSource dataSource = ctx.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
