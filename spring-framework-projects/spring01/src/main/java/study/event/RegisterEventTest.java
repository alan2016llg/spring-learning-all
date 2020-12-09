package study.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.event.service.RegisterService;

/**
 * @Author: liulg
 * @Date: 2020/10/14 11:39
 */
public class RegisterEventTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("study.event");
        RegisterService service = context.getBean(RegisterService.class);
        service.register("张三");
    }
}
