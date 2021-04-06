package dao.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

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

    public void getUser() {
        List<Map<String, Object>> query = jdbcTemplate.query("select * from tbl_user", new ColumnMapRowMapper());
        query.stream().forEach(map -> System.out.println(map.get("id") + "--" + map.get("name")));
    }
}
