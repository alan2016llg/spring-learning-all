package study.a_conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import study.a_conditional.normal.ConditionalOnBean;

/**
 * @Author: liulg
 * @Date: 2020/10/14 14:42
 */
@Configuration
public class BartenderConfiguration {
    @Bean
    @ConditionalOnBean(Boss.class)
    public Bartender zhangxiaosan() {
        return new Bartender("张小三");
    }

    @Bean
    @ConditionalOnBean(beanNames = "study.a_conditional.Boss")
    public Bartender zhangdasan() {
        return new Bartender("张大三");
    }
}
