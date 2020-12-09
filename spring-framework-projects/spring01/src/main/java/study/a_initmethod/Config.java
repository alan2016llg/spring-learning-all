package study.a_initmethod;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/10/9 14:34
 */
@Component
public class Config {

    @Bean(initMethod = "initb",destroyMethod = "destroyb")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public  Pen3 pen3(){
        return  new Pen3();
    }
}
