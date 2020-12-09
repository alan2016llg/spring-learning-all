package study.di.proconf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: liulg
 * @Date: 2020/9/27 1:06
 * 外部配置文件引入
 */
@ComponentScan("study.di.bean")
@PropertySource("classpath:basic_di/red.properties")
public class InjectValueConfiguration {
}
