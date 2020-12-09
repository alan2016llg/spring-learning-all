package study.enablejdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Author: liulg
 * @Date: 2020/12/8 15:17
 */
@PropertySource("classpath:enablejdbc/jdbc.properties")
public  class AbstractConfiguration {
    @Autowired
    Environment environment;
}
