package study.event.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import study.event.service.RegisterSuccessEvent;

/**
 * @Author: liulg
 * @Date: 2020/10/14 11:30
 */
@Component
public class SmsSenderListener implements ApplicationListener<RegisterSuccessEvent> {
    @Override
    public void onApplicationEvent(RegisterSuccessEvent event) {
        System.out.println("监听到注册成功事件，发送短信");
    }
}
