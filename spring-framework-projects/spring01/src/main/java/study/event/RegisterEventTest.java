package study.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.event.service.RegisterService;

/**
 * @Author: liulg
 * @Date: 2020/10/14 11:39
 * <p>
 * 事件发布器（ApplicationEventPublisher ）是用来接受事件，并交给事件广播器（ApplicationEventMulticaster ）处理；事件广播器拿到事件发布器的事件，并广播给监听器
 */
public class RegisterEventTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("study.event");
        RegisterService service = context.getBean(RegisterService.class);
        service.register("张三");
    }
}
