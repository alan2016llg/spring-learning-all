package dao.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.List;
import java.util.Map;

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

    @Transactional(propagation = Propagation.REQUIRED)
    public void getUser() {
        System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
        jdbcTemplate.update("insert into tbl_user(name,tel) values(?,?)", "xiaohong", "17");
        try {
            insert.insetUser();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
