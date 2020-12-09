package study.enablejdbcspi;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @Author: liulg
 * @Date: 2020/12/8 16:43
 */
@ConditionalOnClassName("oracle.jdbc.Driver")
public class OracleJdbcConfiguration extends AbstractConfiguration {
    @Bean(name = "dataSourceOracle")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("oracle.jdbc.Driver");
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        return dataSource;
    }
}
