package dao.test3;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.annotation.Resource;

/**
 * @Author: liulg
 * @Date: 2021/3/29 21:51
 */
@Service
public class InsertImpl {

    @Resource
    JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insetUser() {
        System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
        jdbcTemplate.update("insert into tbl_user(name,tel) values(?,?)", "bbbbb", "999");
        int m = 1/0;
    }
}
