package study.definition_datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @Author: liulg
 * @Date: 2021/4/6 10:44
 * 多数据源测试
 */
public class Test {
    public static void main(String[] args) throws Exception{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyDataSourceRegistryPostProcessor.class);
        String[] names = context.getBeanNamesForType(DruidDataSource.class);
        for (int i=0;i<names.length;i++){
            DataSource source = (DataSource) context.getBean(names[i]);
            QueryRunner runner = new QueryRunner(source);
            List<Map<String, Object>> query = runner.query("select * from tbl_user", new MapListHandler());
            query.stream().forEach(map->System.out.println(map.get("name")));
        }
    }
}
