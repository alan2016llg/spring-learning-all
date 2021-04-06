package study.enablejdbcspi;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.Arrays;

/**
 * @Author: liulg
 * @Date: 2020/12/8 14:55
 * 基于spring SPI方式进行数据源加载
 */
@Configuration
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
