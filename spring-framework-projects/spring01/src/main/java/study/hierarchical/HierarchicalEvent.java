package study.hierarchical;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: liulg
 * @Date: 2020/12/9 16:50
 * 声明一个事件
 */
public class HierarchicalEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public HierarchicalEvent(Object source) {
        super(source);
    }
}
