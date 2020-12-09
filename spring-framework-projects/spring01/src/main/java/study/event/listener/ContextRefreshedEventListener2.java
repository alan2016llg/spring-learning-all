package study.event.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/10/14 10:55
 */
@Component
public class ContextRefreshedEventListener2  {

    @EventListener
    public void listener(ContextClosedEvent event) {
        System.out.println("注解方式监听到ContextClosedEvent事件！");

    }
}
