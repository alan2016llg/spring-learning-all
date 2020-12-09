package study.payloadevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2020/12/9 17:30
 * PayloadApplicationEvent事件测试
 */
public class PayloadApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.addApplicationListener(new PayloadObjectApplicationListener());
        ctx.addApplicationListener(new PayloadStringApplicationListener());
        ctx.refresh();
        ctx.publishEvent("string....");
        ctx.publishEvent(123456);
    }
}
