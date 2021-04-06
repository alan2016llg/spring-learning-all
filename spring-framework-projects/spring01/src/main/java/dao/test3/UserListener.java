package dao.test3;

import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @Author: liulg
 * @Date: 2021/3/31 14:35
 */
@Component
public class UserListener {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void testEvent(UserEvent event){
        System.out.println("事物提交后回调事件....."+event.getSource());
    }
}
