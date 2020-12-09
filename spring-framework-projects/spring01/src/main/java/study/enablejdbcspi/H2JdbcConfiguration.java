package study.enablejdbcspi;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: liulg
 * @Date: 2020/12/8 15:18
 */
@ConditionalOnClassName("org.h2.Driver")
public class H2JdbcConfiguration extends AbstractConfiguration {
    @Bean(name = "dataSourceH2")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:~/test");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }
}
