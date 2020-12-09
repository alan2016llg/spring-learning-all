package study.enablejdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liulg
 * @Date: 2020/12/8 14:55
 *自定义数据源加载方式
 */
@Configuration
@EnableJdbc
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Test.class);
        DruidDataSource dataSource = ctx.getBean("dataSource",DruidDataSource.class);
        DruidDataSource dataSource2 = ctx.getBean("dataSourceH2",DruidDataSource.class);
        System.out.println(dataSource2.getUrl());
        System.out.println(dataSource.getUrl());
    }
}
