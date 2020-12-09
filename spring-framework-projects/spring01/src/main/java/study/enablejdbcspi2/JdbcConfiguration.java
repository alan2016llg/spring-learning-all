package study.enablejdbcspi2;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @Author: liulg
 * @Date: 2020/12/8 17:58
 */

public class JdbcConfiguration {
    @Bean
    public DataSourceRegisterPostProcessor dataSourceRegisterPostProcessor() {
        return new DataSourceRegisterPostProcessor();
    }

    @Bean
    public QueryRunner queryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }
}
