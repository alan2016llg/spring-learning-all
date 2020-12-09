package study.enablejdbcspi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Author: liulg
 * @Date: 2020/12/8 15:17
 */
public abstract class AbstractConfiguration implements EnvironmentAware {

    Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
