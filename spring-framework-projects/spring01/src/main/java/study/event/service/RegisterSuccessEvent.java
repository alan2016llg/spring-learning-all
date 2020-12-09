package study.event.service;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: liulg
 * @Date: 2020/10/14 11:26
 *
 * 自定义事件：一个注册成功的事件
 */
public class RegisterSuccessEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public RegisterSuccessEvent(Object source) {
        super(source);
    }
}
