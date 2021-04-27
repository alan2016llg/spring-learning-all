package dao.test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @Author: liulg
 * @Date: 2021/3/29 21:04
 */
@Service
public class ServiceImpl {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    InsertImpl insert;

    @Autowired
    ApplicationEventPublisher publisher;

    @Transactional(propagation = Propagation.REQUIRED)
    public void getUser() {
        System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
        jdbcTemplate.update("insert into tbl_user(name,tel) values(?,?)", "1234", "1777777");
        insert.insetUser();
       /* try {
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        publisher.publishEvent(new UserEvent("execute eover"));
    }

}
