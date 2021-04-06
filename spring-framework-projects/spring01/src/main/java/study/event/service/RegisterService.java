package study.event.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @Author: liulg
 * @Date: 2020/10/14 11:35
 * 事件发布器：通过回调注入方式来发布事件
 */
@Service
public class RegisterService implements ApplicationEventPublisherAware {
    ApplicationEventPublisher publisher;


    public void register(String username) {
        //模拟 用户注册的动作。。。
        System.out.println(username + "注册成功。。。");
        // 发布事件
        publisher.publishEvent(new RegisterSuccessEvent(username));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
