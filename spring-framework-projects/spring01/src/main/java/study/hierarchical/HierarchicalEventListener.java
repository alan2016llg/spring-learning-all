package study.hierarchical;

import org.springframework.context.ApplicationListener;

/**
 * @Author: liulg
 * @Date: 2020/12/9 16:51
 * 声明一个监听器
 */
public class HierarchicalEventListener implements ApplicationListener<HierarchicalEvent> {
    @Override
    public void onApplicationEvent(HierarchicalEvent event) {
        System.out.println("监听到了一个事件：" + event.toString());
    }
}
