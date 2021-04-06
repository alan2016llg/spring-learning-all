package study.aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liulg
 * @Date: 2020/10/9 9:40
 */
@Configuration
public class AwareConfiguration {

    @Bean
    public AwaredTestBean aaa() {
        return new AwaredTestBean();
    }
}
