package study.hierarchical;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.annotation.AnnotationConfigApplication;

/**
 * @Author: liulg
 * @Date: 2020/12/9 16:56
 * <p>
 * 打印的结果表示：子容器的事件会向上传播到父容器，父容器的事件不会向下传播
 */
public class HierarchicalEventApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext parentCtx = new AnnotationConfigApplicationContext();
        parentCtx.addApplicationListener(new HierarchicalEventListener());
        AnnotationConfigApplicationContext chirdCtx = new AnnotationConfigApplicationContext();
        chirdCtx.setParent(parentCtx);
        chirdCtx.addApplicationListener(new HierarchicalEventListener());
        //父、子容器刷新
        parentCtx.refresh();
        chirdCtx.refresh();
        parentCtx.publishEvent(new HierarchicalEvent("父容器发布。。"));
        chirdCtx.publishEvent(new HierarchicalEvent("子容器发布。。"));
    }
}
