package dao.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2021/3/29 21:04
 */
public class TestClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
        ServiceImpl bean = ctx.getBean(ServiceImpl.class);
        bean.getUser();
    }
}
