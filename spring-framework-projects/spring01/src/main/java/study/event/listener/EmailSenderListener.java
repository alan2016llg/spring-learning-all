package study.event.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import study.event.RegisterSuccessEvent;

/**
 * @Author: liulg
 * @Date: 2020/10/14 11:31
 */
@Component
public class EmailSenderListener {

    @EventListener
    public void emailSenderListener(RegisterSuccessEvent event){
        String name = (String) event.getSource();
        System.out.println("监听到注册成功事件，发送邮件to:"+name);
    }
}
