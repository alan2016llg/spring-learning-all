package study.payloadevent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;

/**
 * @Author: liulg
 * @Date: 2020/12/9 17:28
 * 声明的监听器
 *
 * 注意 PayloadApplicationEvent 本身是有泛型的哦，如果不指定具体的泛型，则会监听所有的 PayloadApplicationEvent 事件。
 */
public class PayloadObjectApplicationListener implements ApplicationListener<PayloadApplicationEvent> {
    @Override
    public void onApplicationEvent(PayloadApplicationEvent event) {
        System.out.println("监听到PayloadApplicationEvent ------> " + event.getPayload());
    }
}
