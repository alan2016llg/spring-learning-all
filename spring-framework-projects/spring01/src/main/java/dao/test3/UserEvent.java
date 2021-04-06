package dao.test3;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2021/3/31 14:35
 */
public class UserEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public UserEvent(Object source) {
        super(source);
    }
}

