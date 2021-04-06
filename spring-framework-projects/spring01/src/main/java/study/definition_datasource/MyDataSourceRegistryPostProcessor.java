package study.definition_datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Author: liulg
 * @Date: 2021/4/6 10:06
 *
 * 自定义多数据源加载
 */
@Configuration
@PropertySource("classpath:mydatasource/datasource.properties")
public class MyDataSourceRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor,EnvironmentAware {

    private Environment environment;

    //添加新的definition
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        String dataSourceKey = environment.getProperty("my.dataSource.name");
        if (dataSourceKey == null) {
            return;
        }
        String[] keys = dataSourceKey.split(",");
        for (int i = 0; i < keys.length; i++) {
            BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(DruidDataSource.class)
                    .addPropertyValue("url", environment.getProperty("my.dataSource." + keys[i] + ".jdbc.url"))
                    .addPropertyValue("username", environment.getProperty("my.dataSource." + keys[i] + ".jdbc.username"))
                    .addPropertyValue("password", environment.getProperty("my.dataSource." + keys[i] + ".jdbc.password"))
                    .addPropertyValue("driverClassName", environment.getProperty("my.dataSource." + keys[i] + ".jdbc.driverClassName"));
            registry.registerBeanDefinition(keys[i] + "DataSource", builder.getBeanDefinition());
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment=environment;
    }
}
